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

import com.example.demo.model.Second;
import com.example.demo.model.first;


@CrossOrigin(origins="http://localhost:8080")

@RestController
@RequestMapping("/api")
public class Scontroller {

	
	@Autowired
	Sservice r3;
	
	
	@GetMapping("/Categories")
	public List<Second> list()
	{
		return r3.listAll();
	}
	
	
	@PostMapping("/Categories/{di}")
	public Second get(@PathVariable Integer id)
	{
		return r3.get(id);
	}
	
	@PostMapping("/Categories")
		public String add(@RequestBody Second s1)
		{
		r3.save(s1);
		return "save";
		}
	
	@PutMapping("/categories/{di}")
	  public ResponseEntity<Second> updateTutorial(@PathVariable Integer di, @RequestBody Second s1 ){
	    
	    Second s2 = r3.get(di);
	    
	    s2.setName(s1.getName());
	    
	   
	    
	      
	      
	   Second s3 = r3.save(s2);
	    
	    
	     return ResponseEntity.ok().body(s3);
	     
	  }
	
	
	@DeleteMapping("/Categories/{di}")
	public void delete(@PathVariable Integer di)
	{
		r3.delete(di);
	}
	
	
}
