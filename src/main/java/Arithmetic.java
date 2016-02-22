
public class Arithmetic {

	
	public static int Average(int x, int y, int z)
	{
		return (x + y + z)/3;
	}
	
	public static int SumArray(int[] arr)
	{
		int sum = 0;
		for(int i=1; i < arr.length; ++i) //fault, does not include first index of array
		{
			sum += arr[i];
		}
		return sum;
	}

}
