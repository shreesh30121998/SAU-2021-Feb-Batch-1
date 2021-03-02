package com.MockitoTesting.junitMockito;

public class CheckPrime {
	CheckPrimeService service;
	public CheckPrime(CheckPrimeService service)
	{
		this.service=service;
	}
	public boolean perform(int n)
	{
		return service.isPrime(n);
	}
	
	public void flow()
	{
		try {
			for(int i=1;i<=100;i++)
			{
				if(perform(i)==true)
					throw new Exception("Prime number found: "+i) ;
			}
		}
		catch(Exception e){
			System.out.println("Prime found");
		}
		
	}
}
