package basics;

public class Operators {

	public static void main(String[] args) {
		/**
		 * 1. ARITHMETIC OPERATORS
		 * 		+ , - , /, %
		 * 
		 *  2. CONDITIONAL OPERATORS
		 *      >,<,==,!=,<=,>=
		 *      
		 *  3. LOGICAL OPERATORS
		 *      || (or) &&(and)
		 */
		//Declare 3 variables
		int x = 40;
		int w = 55;
	    float y = (float)87.45;
	    
	    //Add and multiply examples
	    float z = (x+y);
	    float a = (x/w);
	    System.out.println(a);
	    
	    /** Modulus example. should 
	     * return the reminder of the division
	     */
	    int b = (x%w);
	    System.out.println(b);
	    
	    //Test a condition example: 
	    boolean e = x == y;
	    boolean f = x < y;
	    
	    //|| (or) gives true when at LEAST ONEcondition is true
	    System.out.println(e +" or " + f +" = "+ (e || f));
	   
	    /**
	     * True || True gives True
	     * True || False gives True
	     * False || False gives False	     * 
	     */
	    
	    //&& (and) gives true when ALL CONDITIONS ARE TRUE.
	    System.out.println(e +" and " + f +" = "+ ((e && e)));
	    
	    /**
	     * True && True gives True
	     * True && False gives False
	     * False && False gives False	     * 
	     */
	    int n = 13;
	    //Odd, || even 
	    System.out.println("Weird " + ((n%2 == 1) || (n%2==0 && (n>5 && n <21) )));
	    	    
	    
	    System.out.println("Not Weird" +((n%2==0 && (n >1 && n<6))  || (n%2==0 && n>20) ));
	}

}
