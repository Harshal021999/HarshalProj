package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.first;
import com.example.demo.repo.Repo;

@CrossOrigin(origins="http://localhost:8080")

@RestController
@RequestMapping("/api")

public class keyController {

	@Autowired
	service r1;
	
	
	@GetMapping("/products")
	public List<first> list()
	{
		return r1.listAll();
	}
	
	
	@GetMapping("/products/{di}")
	public first get(@PathVariable Integer di)
	{
		return r1.get(di);
	}
	
	@PostMapping("/products")
		public void add(@RequestBody first p1)
		{
		r1.save(p1);
		}
	
	
	@PutMapping("/products/{di}")
	  public ResponseEntity<first> updateTutorial(@PathVariable Integer di, @RequestBody first p1) {
	    first p2 = r1.get(di);
	    
	  
	   p2.setName(p1.getName());
	   p2.setNumber(p1.getNumber());
	      
	      
	   first f3 = r1.save(p2);
	    
	    
	     return ResponseEntity.ok().body(f3);
	     
	  }
	
	@DeleteMapping("/products/{di}")
	public void delete(@PathVariable Integer di)
	{
		r1.delete(di);
	}
	
	

}
