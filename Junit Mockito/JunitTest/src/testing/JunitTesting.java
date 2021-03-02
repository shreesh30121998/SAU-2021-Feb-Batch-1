package testing;

public class JunitTesting {

	public boolean isPrime(int n)
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
	
	public void flow()
	{
		try {
			for(int i=1;i<=100;i++)
			{
				if(isPrime(i)==true)
					throw new Exception("Prime number found: "+i) ;
			}
		}
		catch(Exception e){
			System.out.println("Prime found");
		}
		
	}
}
