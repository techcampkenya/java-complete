package intermediate;

public class GradeSystemTest {
	/*
	 * Create a method which takes 5 int parameters.math,eng,swa,sci,sos
	 * it should find the sum and return the total. 
	 * Call the method totalMarks.
	 */
	
	public int totalMarks(int math,int eng,int swa,int sci,int sos)
	{
		int sum = math + eng + swa + sci + sos;
		return sum;			
	}
	
	/*
	 * Create a method called averageMarks. that takes input 1 parameter
	 * called total. It should divide by 5 and return the average.
	 */
	
	public float averageMarks(int t)
	{
		float a = t/5;
		return a;
	}

	/*
	 * Create a method that takes 1 parameter, average, finds the grade 
	 * and returns. 
	 * 
	 */
}
