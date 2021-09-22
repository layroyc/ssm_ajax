package com.xiexin.dao;

import com.xiexin.bean.PeiJian;
import com.xiexin.bean.PeiJianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeiJianDAO {
    long countByExample(PeiJianExample example);

    int deleteByExample(PeiJianExample example);

    int deleteByPrimaryKey(Integer peiJianId);

    int insert(PeiJian record);

    int insertSelective(PeiJian record);

    List<PeiJian> selectByExample(PeiJianExample example);

    PeiJian selectByPrimaryKey(Integer peiJianId);

    int updateByExampleSelective(@Param("record") PeiJian record, @Param("example") PeiJianExample example);

    int updateByExample(@Param("record") PeiJian record, @Param("example") PeiJianExample example);

    int updateByPrimaryKeySelective(PeiJian record);

    int updateByPrimaryKey(PeiJian record);
}