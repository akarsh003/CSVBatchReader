package com.example.demo.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.controller.ControllerClass;
import com.example.demo.controller.IssueIntakeResponse;

//import com.example.demo.model.Employee;
@Transactional
public class ItemProc<T> implements ItemProcessor<T,T> {
	
	int i=0;
	int counterrors=0;
	
	List<HashMap<String,Object>> list=new ArrayList<HashMap<String, Object>>();
	

	@Autowired
	private ControllerClass controllerClass;
	



	@Override
	@Transactional(rollbackFor = InvalidOrderItemException.class)
	public T process(T item) throws Exception {
		// TODO Auto-generated method stub
	
	        	
	        	//API call for validation can be done here


		return item;
	}

	
	
} 
