package intermediate;

public class SumAll {
	
	public int sum_them(int x)
	{
		String t = String.valueOf(x); //"675"
		int total = 0;
		
		for(int i =0; i< t.length();i++)
		{
//			System.out.println(i +" is i and total is " +total+" val of "+Integer.parseInt(String.valueOf(t.charAt(i))));
			total = total + Integer.parseInt(String.valueOf(t.charAt(i)));
		}
		return total;
	}

}
