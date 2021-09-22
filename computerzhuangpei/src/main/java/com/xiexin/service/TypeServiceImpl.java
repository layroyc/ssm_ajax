package com.xiexin.service;


import com.xiexin.bean.Type;
import com.xiexin.bean.TypeExample;
import com.xiexin.dao.TypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("typeService")
public class TypeServiceImpl implements TypeService {
	@Autowired(required = false)
	private TypeDAO typeDAO;
	public long countByExample(TypeExample example){
    	return typeDAO.countByExample(example);
    }

	public int deleteByExample(TypeExample example){
    	return typeDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return typeDAO.deleteByPrimaryKey(id);
    }

	public int insert(Type record){
    	return typeDAO.insert(record);
    }

	public int insertSelective(Type record){
    	return typeDAO.insertSelective(record);
    }

	public List<Type> selectByExample(TypeExample example){
    	return typeDAO.selectByExample(example);
    }

	public Type selectByPrimaryKey(Integer id){
    	return typeDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Type record, TypeExample example){
    	return typeDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Type record, TypeExample example){
    	return typeDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Type record){
    	return typeDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Type record){
    	return typeDAO.updateByPrimaryKey(record);
    }
}
