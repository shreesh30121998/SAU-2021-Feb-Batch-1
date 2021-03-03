package com.Hibernate.hib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {
	@Id
	private int sid;
	
	@ManyToMany(mappedBy="sups")
	List<Category> cats=new ArrayList<Category>();
	
	@ManyToMany(mappedBy="sups")
	List<Product> prods=new ArrayList<Product>();
	
	public List<Category> getCats() {
		return cats;
	}
	public void setCats(List<Category> cats) {
		this.cats = cats;
	}
	public List<Product> getProds() {
		return prods;
	}
	public void setProds(List<Product> prods) {
		this.prods = prods;
	}
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", cats=" + cats + ", prods=" + prods + ", sname=" + sname + "]";
	}
	

}