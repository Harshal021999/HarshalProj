package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class first {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int di;
	@Override
	public String toString() {
		return "first [di=" + di + ", name=" + name + ", number=" + number + "]";
	}
	public int getDi() {
		return di;
	}
	public void setDi(int di) {
		this.di = di;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	private String name;
	private int number;
	
}
