package com.javapractice;
import java.util.*;
public class java1 {
	
	public static void main(String[] args)
    {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str = s.nextLine();
        System.out.print("Enter string to be replcaed: ");
        String s1=s.nextLine();
        System.out.print("Enter string to be placed: ");
        String s2=s.nextLine();
        String new_str = str.replaceAll(s1, s2);
        System.out.println();
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }

}
