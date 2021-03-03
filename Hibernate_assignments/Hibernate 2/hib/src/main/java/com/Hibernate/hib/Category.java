package com.Hibernate.hib;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Category {
	@Id
	private int catid;
	private String catname;
	
	@ManyToOne
	private Product product;
	
	@ManyToMany(mappedBy="cats")
	List<Supplier> sups=new ArrayList<Supplier>();
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public List<Supplier> getSups() {
		return sups;
	}
	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", catname=" + catname + "]";
	}
	

}
