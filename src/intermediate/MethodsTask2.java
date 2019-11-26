package intermediate;

public class MethodsTask2 {
	
	public int isVowel(String str)
	{
		int count = 0;
		for(int i =0; i < str.length();i++)
		{
			char v =str.charAt(i);
			if(v == 'a' || v == 'e')
			{
				count = count + 1;
			}
		}
		return count;
	}

}
