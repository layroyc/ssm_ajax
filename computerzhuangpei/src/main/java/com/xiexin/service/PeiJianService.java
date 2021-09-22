package com.xiexin.service;


import com.xiexin.bean.PeiJian;
import com.xiexin.bean.PeiJianExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeiJianService {
   
    long countByExample(PeiJianExample example);

    int deleteByExample(PeiJianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeiJian record);

    int insertSelective(PeiJian record);

    List<PeiJian> selectByExample(PeiJianExample example);

    PeiJian selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") PeiJian record, @Param("example") PeiJianExample example);

    int updateByExample(@Param("record") PeiJian record, @Param("example") PeiJianExample example);

    int updateByPrimaryKeySelective(PeiJian record);

    int updateByPrimaryKey(PeiJian record);
}
