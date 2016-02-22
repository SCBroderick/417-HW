import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestArithmetic {

	@Test
	public void TestSumArray() {
		
		int[] arr = {1, 2, 3};
		int expected = 6;
		int actual = Arithmetic.SumArray(arr);
		
		assertEquals(expected, actual);
		
	}

}