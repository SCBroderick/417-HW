
public class Arithmetic {

	
	public static int Average(int x, int y, int z)
	{
		return (x + y + z)/3;
	}
	
	public static int SumArray(int[] arr)
	{
		int sum = 0;
		for(int i=0; i < arr.length; ++i) //fault fixed
		{
			sum += arr[i];
		}
		return sum;
	}

}
