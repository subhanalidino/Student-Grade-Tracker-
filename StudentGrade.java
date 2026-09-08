import java.util.Scanner;
class StudentGrade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students .");
		int student_No = sc.nextInt();
		sc.nextLine();

		String[] Names = new String[student_No];
		int[] Grades = new int[student_No];
		int sum =0;
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		
		for(int i=0; i<student_No; i++){
			System.out.println("Enter Name of Student :" + " " + (i+1));
			String Name = sc.next();
			System.out.println("Enter Grade for Student:" + " " + (i+1));
			int grade = sc.nextInt();
			Grades[i] = grade;
			Names[i] = Name;
			sum += grade;
			if(Grades[i] > Max){
				Max = Grades[i];
			}
			if(Grades[i] < Min){
				Min = Grades[i];
			}
		}
		double Average = (double)sum / student_No;
		System.out.println("Average Score is : " + Average);
		System.out.println("Highest Score is : " + " " + Max);
		System.out.println("Lowest Score is : " + " " + Min);

		System.out.println();
		System.out.println("****************************************************");
		System.out.println("============ Summary Report of Students ============");
		for(int i=0; i<student_No; i++){
		System.out.println("Name  of Student"  + " " + (i+1) + ":" + " " + Names[i]);
		System.out.println("Grade of Student"  + " " + (i+1) + ":" + " " + Grades[i]);
		}
		System.out.println("================== End of Report ===================");
		System.out.println("****************************************************");



	}
}