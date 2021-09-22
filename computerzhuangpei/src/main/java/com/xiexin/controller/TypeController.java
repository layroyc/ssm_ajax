package com.xiexin.controller;

import com.xiexin.bean.Type;
import com.xiexin.service.TypeService;
import com.xiexin.utils.code.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/type")
public class TypeController {
    @Autowired
    private TypeService typeService;
    //查全
    @RequestMapping("/selectTypeAll")
    public DataResult<Type>  selectTypeAll(){
        List<Type> types = typeService.selectByExample(null);
        DataResult result=DataResult.success();
        if (!types.isEmpty()){
            result.setData(types);
            result.setCode(200);
            return result;
        }else{
            result.setCode(400);
            return result;
        }

    }
    // 添加
    @RequestMapping("/insertType")
    public DataResult<Type> insertType(Type type){
        DataResult result=   DataResult.success();
        int i = typeService.insertSelective(type);
        if (i == 1) {
                    result.setCode(200);
                    result.setMsg("添加成功");
            return result;
        }else{
            result.setCode(400);
            result.setMsg("添加失败");
            return result;
        }

    }

}
