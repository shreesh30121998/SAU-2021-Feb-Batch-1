package com.javapractice;

import java.util.NavigableSet;
import java.util.TreeMap;

public class java2 {
	public static void main(String[] args) 
    { 
  
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(); 
        treemap.put(2, "two"); 
        treemap.put(0, "zero"); 
        treemap.put(3, "three"); 
        treemap.put(6, "six"); 
        treemap.put(9, "nine"); 
        treemap.put(7, "seven"); 
        NavigableSet set1 = treemap.descendingKeySet(); 
  
        System.out.println("Navigable set values are: " + set1); 
    } 

}
