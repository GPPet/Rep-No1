package may22th.Student;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
		//Student peter = new Student("Peter", "Petrov", 6735, 1);
		//Student maria = new Student("Maria", "Dimitrova", 6756, 2);
		//Student elsa = new Student("Elsa", "Petrimska", 6743, 2);
		//Student petruna = new Student("Petruna", "Delivna",6744, 2);
		//Student ivan = new Student("Ivan", "Simov", 6723, 3);

		//System.out.println(peter + "\n");
		//System.out.println(maria + "\n");
				
		
		//ili
		
		Scanner input = new Scanner(System.in);
		String firstName = "";
		String familyName = "";
		int facNumber = 0;
		int group = 0;
		int length = 2;
		
		String[] students = new String[length];
		Student student = new Student(firstName, familyName, facNumber, group);
		String studentInfo = student.toString();
		
		for(int i = 0; i < students.length; i++){
			System.out.println("Please, enter name, family name, faculty number and group of the student:");
			firstName = input.nextLine();
			familyName = input.nextLine();
			facNumber = input.nextInt();
			group = input.nextInt();
			input.nextLine();
			
			student = new Student(firstName, familyName, facNumber, group);
			studentInfo = student.toString();
			students[i] = studentInfo;
		}
		

		for(int i = 0; i < students.length; i++){
			System.out.println(students[i] + "\n");
		}

	}

}
