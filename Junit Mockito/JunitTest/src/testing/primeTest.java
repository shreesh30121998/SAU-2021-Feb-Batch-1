package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class primeTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		boolean output = test.isPrime(13);
		assertEquals(true,output);
	}

}
