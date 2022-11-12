package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Second {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk" , referencedColumnName = "sid")
	private List<first> first;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<first> getFirst() {
		return first;
	}

	public void setFirst(List<first> first) {
		this.first = first;
	}

	@Override
	public String toString() {
		return "Second [sid=" + sid + ", name=" + name + ", first=" + first + "]";
	}
	
	
	
	
	
	
}


