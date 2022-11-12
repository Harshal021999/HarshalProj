package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Second;
import com.example.demo.model.first;
import com.example.demo.repo.Repo;
import com.example.demo.repo.Srepo;

@Service
public class Sservice {

	@Autowired
	private Srepo r3;
	
	public List<Second> listAll()
	{
		return r3.findAll();
	}
	
	public Second save(Second f1)
	{
		return r3.save(f1);
		
	}
	
	public Second get(Integer id)
	{
		return r3.findById(id).get();
		
	}
	
	public void delete(Integer id)
	{
		r3.deleteById(id);
	}
	
}
