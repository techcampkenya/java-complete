package basics;


public class Variables {

	/** This method is called when the class is run. 
	 * Write any logic you want to execute here
	 * @param edwin
	 */
	public static void main(String[] args) {
		/**We use the inbuilt System class and print method
		 *  to print on the console
		 */
		String name = "My name is John";
		System.out.println(name);
		
		Integer age = 30;
		System.out.println("i am " + age +" years old.");
		
		Float amount = (float)67.44243423243424565456544565435654334565676545676545676567655676545676567876567655;
		System.out.println(amount);
		
		Double amount_double= 67.44243423243424565456544565435654334565676545676545676567655676545676567876567655;
		System.out.println(amount_double);
		
		Boolean x = amount_double > amount; 
		System.out.println(x);
		
		Character grade = '%';
		System.out.print(grade);

	}

}
