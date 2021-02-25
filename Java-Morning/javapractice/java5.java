package com.javapractice;

class primeexp extends Exception{

}
public class java5{
	static boolean isPrime(int n) 
    { 
        if (n <= 1) 
        	return false; 
        if (n <= 3) 
        	return true; 
      
        if (n % 2 == 0 || n % 3 == 0) 
        	return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    }
	public static void main(String[] args)
	{
		for(int i=0;i<=100;i++)
		{
			try {
				if(isPrime(i))
				{
					throw new primeexp();
				}
			}
			catch(primeexp e)
			{
				System.out.println(i+" "+"is PRIME!!");
			}
		}
	}
	
}
