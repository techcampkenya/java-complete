package intermediate;

import java.util.ArrayList;
import java.util.List;

public class GradeSystemRunner {
	
	public static void main(String[] args) {
		
		GradeSystem vin = new GradeSystem();
		vin.totalMarks(79, 78, 45, 30, 15);
		
		GradeSystem kim = new GradeSystem();
		kim.totalMarks(79, 68, 75, 80, 85);
		
		List<GradeSystem> stud = new ArrayList<>();
		stud.add(kim);
		stud.add(vin);
		
		for (GradeSystem gradeSystem : stud) {
			System.out.println(gradeSystem);
		}
		
	}
}
