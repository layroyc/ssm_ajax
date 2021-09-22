package com.xiexin.service;


import com.xiexin.bean.Computer;
import com.xiexin.bean.ComputerExample;
import com.xiexin.dao.ComputerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("computerService")
public class ComputerServiceImpl implements ComputerService {
	@Autowired(required = false)
	private ComputerDAO computerDAO;
	public long countByExample(ComputerExample example){
    	return computerDAO.countByExample(example);
    }

	public int deleteByExample(ComputerExample example){
    	return computerDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return computerDAO.deleteByPrimaryKey(id);
    }

	public int insert(Computer record){
    	return computerDAO.insert(record);
    }

	public int insertSelective(Computer record){
    	return computerDAO.insertSelective(record);
    }

	public List<Computer> selectByExample(ComputerExample example){
    	return computerDAO.selectByExample(example);
    }

	public Computer selectByPrimaryKey(Integer id){
    	return computerDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Computer record, ComputerExample example){
    	return computerDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Computer record, ComputerExample example){
    	return computerDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Computer record){
    	return computerDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Computer record){
    	return computerDAO.updateByPrimaryKey(record);
    }
}
