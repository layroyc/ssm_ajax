package com.xiexin.controller;

import com.xiexin.bean.PeiJian;
import com.xiexin.bean.PeiJianExample;
import com.xiexin.service.PeiJianService;
import com.xiexin.utils.code.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peiJian")   // peiJian
public class PeiJianController {
    @Autowired
    private PeiJianService peiJianService;

    // 添加
    @RequestMapping("/peiJianInsert")  // peiJanInsert
    public DataResult peijianInsert(PeiJian peiJian){
        DataResult result=  DataResult.success();
        int i = peiJianService.insertSelective(peiJian);
        return DataResult.getDataResult(result,i);
    }

    // 删



    // 改
    @RequestMapping("/peiJianUpdate")
    public DataResult peiJianUpdate(PeiJian peiJian){
        DataResult result=   DataResult.success();
        int i = peiJianService.updateByPrimaryKeySelective(peiJian);
        return DataResult.getDataResult(result,i);
    }

    // 查
    // 查全非分页
    @RequestMapping("/peiJianSelect")
    public DataResult peiJianSelect (){
        DataResult result=DataResult.success();
        List<PeiJian> datas = peiJianService.selectByExample(null);
        result.setData(datas);
        result.setCode(200);
        return result;
    }

    // 分页查全
    @RequestMapping("/peiJianSelectByPage")
    public DataResult peiJianSelectByPage(PeiJian peijian, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "limit", required = false, defaultValue = "1") Integer limit){
        DataResult result=DataResult.success();

        int offset = ((page - 1) * limit);
        Long offSet = (long) offset;
        // 根据公式转换  $offset=($page-1)*$pagesize用法  pageSize 就是 limit
        //stalls.setOffset(offset);
        // stalls.setLimit(limit); 本来这样, 现在 example 有 更省力的
        PeiJianExample example=new PeiJianExample();
        example.setOffset(offSet);
        example.setLimit(limit);

        PeiJianExample.Criteria criteria = example.createCriteria();

        if (peijian.getPeiJianName()!=null&&!peijian.getPeiJianName().equals("")){
            criteria.andPeiJianNameLike("%"+peijian.getPeiJianName()+"%");
        }
        if (peijian.getPeiJianPrice()!=null){
            criteria.andPeiJianPriceEqualTo(peijian.getPeiJianPrice());
        }
        if (peijian.getPeiJianRongLiang()!=null&&!peijian.getPeiJianRongLiang().equals("")){
            criteria.andPeiJianRongLiangEqualTo(peijian.getPeiJianRongLiang());
        }
        List<PeiJian> datas = peiJianService.selectByExample(example);
        long l = peiJianService.countByExample(example);
        // 总页数
        return DataResult.getPageDataResult(page, limit, result, datas, l);

    }
    // 查  -- 计算 一个 电脑的 配件价格
    @RequestMapping("/peiJianSelectForPrice")
    public DataResult peiJianSelectForPrice(@RequestParam("nameList[]")List<String> nameList){
        System.out.println(nameList);
        DataResult result=DataResult.success();
        double totalPrice=0.0;
        for (String peiJianName : nameList) {
            System.out.println(peiJianName);
                //遍历出来 价格 加等 就好
            PeiJianExample example=new PeiJianExample();
            PeiJianExample.Criteria criteria = example.createCriteria();
                            criteria.andPeiJianNameEqualTo(peiJianName);
            List<PeiJian> datas = peiJianService.selectByExample(example);
            if (datas.size()>0) {
                // 有数据 就计算
                Double peiJianPrice = datas.get(0).getPeiJianPrice();
                totalPrice+=peiJianPrice;
            }else{
                result.setCode(400);
                result.setMsg("操作失败");
                return result;
            }

        }
        result.setCode(200);
        result.setData(totalPrice);
        return result;
    }
}
