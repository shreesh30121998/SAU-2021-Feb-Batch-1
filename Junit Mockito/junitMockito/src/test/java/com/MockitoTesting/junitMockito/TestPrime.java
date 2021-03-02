package com.MockitoTesting.junitMockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPrime {
	
	CheckPrime cp= null;
	CheckPrimeService service = new CheckPrimeService(){
		// TODO Auto-generated constructor stub
		public boolean isPrime(int n)
		{
			if (n <= 1) return false; 
	        if (n <= 3) return true; 
	        if (n % 2 == 0 || n % 3 == 0) 
	            return false; 
	        for (int i = 5; i * i <= n; i = i + 6) 
	            if (n % i == 0 || n % (i + 2) == 0) 
	                return false; 
	        return true;
		}
	};// for testing we need to make a fake object
	@Before
	public void setUp()
	{
		cp=new CheckPrime(service);
	}
	@Test
	public void test() {
		boolean output = cp.perform(13);
		assertEquals(true,output);
	}

}
