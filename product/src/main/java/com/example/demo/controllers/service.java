package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.first;
import com.example.demo.repo.Repo;

@Service
public class service {
	
	
	@Autowired
	private Repo r2;
	
	public List<first> listAll()
	{
		return r2.findAll();
	}
	
	public first save(first f1)
	{
		return r2.save(f1);
		
	}
	
	public first get(Integer id)
	{
		return r2.findById(id).get();
		
	}
	
	public void delete(Integer id)
	{
		r2.deleteById(id);
	}
	
	public void update(first f1, Integer id)
	{
		r2.save(f1);
	}
}
