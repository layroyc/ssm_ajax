package com.xiexin.controller;

import com.xiexin.bean.Computer;
import com.xiexin.bean.ComputerExample;
import com.xiexin.service.ComputerService;
import com.xiexin.utils.code.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;
    // 添加
    @RequestMapping("/computerInsert")
    public DataResult computerInsert(Computer computer){
        DataResult result=   DataResult.success();
        int i = computerService.insertSelective(computer);
        return DataResult.getDataResult(result,i);

    }

    // 删除
    @RequestMapping("/computerDelete")
    public DataResult computerDelete(Integer pcId){
        DataResult result=   DataResult.success(pcId);
        int i = computerService.deleteByPrimaryKey(pcId);
        return DataResult.getDataResult(result,i);
    }
    //修改
    @RequestMapping("/computerUpdate")
    public DataResult computerUpdate(Computer computer){
        System.out.println(computer.getPcId());
        DataResult result=   DataResult.success();
        int i = computerService.updateByPrimaryKeySelective(computer);
        return DataResult.getDataResult(result,i);
    }



    //查全  分页
   @RequestMapping("/computerSelectByPage")
    public DataResult  computerSelectByPage (Computer computer, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "limit", required = false, defaultValue = "1") Integer limit){
       DataResult result=DataResult.success();

       int offset = ((page - 1) * limit);
       Long offSet = (long) offset;
       // 根据公式转换  $offset=($page-1)*$pagesize用法  pageSize 就是 limit
       //stalls.setOffset(offset);
       // stalls.setLimit(limit); 本来这样, 现在 example 有 更省力的


       ComputerExample example=new ComputerExample();
       example.setOffset(offSet);
       example.setLimit(limit);

       ComputerExample.Criteria criteria = example.createCriteria();

       /*if (peijian.getPeiJianName()!=null&&!peijian.getPeiJianName().equals("")){
           criteria.andPeiJianNameLike("%"+peijian.getPeiJianName()+"%");
       }
       if (peijian.getPeiJianPrice()!=null&&!peijian.getPeiJianPrice().equals("")){
           criteria.andPeiJianPriceEqualTo(peijian.getPeiJianPrice());
       }
       if (peijian.getPeiJianRongLiang()!=null&&!peijian.getPeiJianRongLiang().equals("")){
           criteria.andPeiJianRongLiangEqualTo(peijian.getPeiJianRongLiang());
       }*/
       List<Computer> datas = computerService.selectByExample(example);
       long l = computerService.countByExample(example);


       // 总页数
       return DataResult.getPageDataResult(page, limit, result, datas, l);

   }



}
