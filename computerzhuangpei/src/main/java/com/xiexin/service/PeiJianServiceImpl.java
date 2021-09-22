package com.xiexin.service;


import com.xiexin.bean.PeiJian;
import com.xiexin.bean.PeiJianExample;
import com.xiexin.dao.PeiJianDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peiJianService")
public class PeiJianServiceImpl implements PeiJianService {
	@Autowired(required = false)
	private PeiJianDAO peiJianDAO;
	public long countByExample(PeiJianExample example){
    	return peiJianDAO.countByExample(example);
    }

	public int deleteByExample(PeiJianExample example){
    	return peiJianDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return peiJianDAO.deleteByPrimaryKey(id);
    }

	public int insert(PeiJian record){
    	return peiJianDAO.insert(record);
    }

	public int insertSelective(PeiJian record){
    	return peiJianDAO.insertSelective(record);
    }

	public List<PeiJian> selectByExample(PeiJianExample example){
    	return peiJianDAO.selectByExample(example);
    }

	public PeiJian selectByPrimaryKey(Integer id){
    	return peiJianDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(PeiJian record, PeiJianExample example){
    	return peiJianDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(PeiJian record, PeiJianExample example){
    	return peiJianDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(PeiJian record){
    	return peiJianDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(PeiJian record){
    	return peiJianDAO.updateByPrimaryKey(record);
    }
}
