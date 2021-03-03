package com.Hibernate.hib;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Category> cat= new ArrayList<Category>();
	
	@ManyToMany(mappedBy="prods")
	List<Supplier> sups=new ArrayList<Supplier>();
	
	public List<Supplier> getSups() {
		return sups;
	}
	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}
	public List<Category> getCat() {
		return cat;
	}
	public void setCat(List<Category> cat) {
		this.cat = cat;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cat=" + cat + "]";
	}
	

}
