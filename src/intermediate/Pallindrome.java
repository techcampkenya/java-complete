package intermediate;

public class Pallindrome {

	public boolean nonNegative(int x)
	{
		if(x > 0)
		{
			String p = String.valueOf(x);
			StringBuffer w = new StringBuffer();
			int y = p.length() - 1;
			for(int i=y; i > -1 ; i--)
			{
				w.append(p.charAt(i));
			}
			System.out.println(w.toString());
			System.out.println(p);
			if(Integer.valueOf(w.toString()) == x)
			{
				return true;
			}
			else
			{
				return false;
			}
		}else {
			return false;
		}
	}
}
