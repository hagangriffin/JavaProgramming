package practice;
import java.util.Scanner;

class Student {
	public String name;
	public int id;
	public int grade1;
	public int grade2;
	public int grade3;
	public int grade4;
	public int total;
	public int average;
		
	public Student(String name, int id, int grade1, int grade2, int grade3, int grade4) {
		this.name = name;
		this.id = id;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.total = grade1 + grade2 + grade3 + grade4;
		this.average = total / 4;
		}

public class StudentClassCreator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter name: ");
			String nm = sc.next();
			System.out.println("Enter ID: ");
			int iD = sc.nextInt();
			System.out.println("Enter Grade 1: ");
			int g1 = sc.nextInt();
			System.out.println("Enter Grade 2: ");
			int g2 = sc.nextInt();
			System.out.println("Enter Grade 3: ");
			int g3 = sc.nextInt();
			System.out.println("Enter Grade 4: ");
			int g4 = sc.nextInt();
			
			arr[i] = new Student(nm, iD, g1, g2, g3, g4);
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.println("Student " + x + ":");
		}
		
	}

}
}
