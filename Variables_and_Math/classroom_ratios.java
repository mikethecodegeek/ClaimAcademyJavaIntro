package Variables_and_Math;

public class classroom_ratios {
//	
//	There are 11 boys and 16 girls in a class with one teacher 
//	and a teacher’s assistant. 
//	What percent of the students are girls? 
//	What is the student-teacher ratio?
			
	public static void main (String[] args) {
			
			int numBoys = 11;
			int numGirls = 16;
			float totalStudents = numBoys + numGirls;
			float girlPercent = (numGirls / totalStudents) * 100;
			
			int numTeachers = 2;
			
			float studentTeacherRatio = totalStudents / numTeachers;
			
			System.out.printf("%.3f%% of the class are girls %n", girlPercent);
			System.out.printf("The Student-Teacher ratio is %.2f", studentTeacherRatio);
			
		}

}
