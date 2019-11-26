package intermediate;

public class GradeSystem {
	/**
	 * 1. Take as input 5 floats.math,eng,swa,sci,sos 
	 * (using an object)
	 * 2. Calculate total_marks.
	 * 3. Calculate average_marks.
	 * 4. Find the grade 
	 */
	
	/**
	 * Create a method which takes 5 parameters adds them
	 *  and returns the result. Call your method totalMarks
	 */
	public float totalMarks(float math,float eng,float swa,float sci,float sos)
	{
		float total = math+eng+swa+sci+sos;
		return total;
	}
	
	/**
	 * Create a method which takes 1 parameter (total) then return 
	 * the average i.e divide by 5.Call the method averageMarks
	 */
	
	public float averageMarks(float total)
	{
		return total/5;
	}
	
	
	/**
	 * Create a method that takes 1 parameter (average) then return 
	 * the grade using the grading system. C'l'all the method grade
	 */
	
	

}
