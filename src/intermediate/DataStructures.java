package intermediate;

import java.util.ArrayList;

public class DataStructures {

	public static void main(String[] args) {
		/*
		 * Arrays are used to store multiple values of the
		 * same data type. They can not be changed
		 */
		String mydays[] = new String[]{"mon","tue","wed","thu","fri","sat","sun"};
		
		/*
		 * We use ArrayList/ List to store variables or objects
		 */
		
		ArrayList<Integer> days = new ArrayList<>();
		
		for(int i =0; i < 10009; i++)
		{
			days.add(i);
		}

	}

}
