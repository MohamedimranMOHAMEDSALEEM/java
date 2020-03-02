package marksheet;

import java.util.Scanner;

public class StudentMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of students");
		Scanner scan = new Scanner(System.in);
		int sizeofStudents = scan.nextInt();
		for (int limit = 0; limit < sizeofStudents; limit++) {
			System.out.println("Enter the mark:");
			int mark = scan.nextInt();
			if ((mark >= 50) && (mark <= 100)) {
				System.out.println("RESULT : PASS");
			} else {
				System.out.println("RESULT : FAIL");

			}

		}

	}

}
