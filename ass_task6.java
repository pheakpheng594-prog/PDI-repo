package assigment;
import java.util.Scanner;
public class ass_task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
	
	        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
	        int math = input.nextInt();
	        int english = input.nextInt();
	        int physics = input.nextInt();
	        int programming = input.nextInt();
	 

	        int max = math;
	        if (english > max) {
	            max = english;
	        }
	        if (physics > max) {
	            max = physics;
	        }
	        if (programming > max) {
	            max = programming;S
	        }

	        int min = math;
	        if (english < min) {
	            min = english;
	        }
	        if (physics < min) {
	            min = physics;
	        }
	        if (programming < min) {
	            min = programming;
	        }

	        double average = (math + english + physics + programming) / 4.0;
	 
	        System.out.println();
	        System.out.println("Output:");
	 
	        System.out.print("Max score is: " + max + " (");
	        if (math == max) {
	            System.out.print("Math ");
	        }
	        if (english == max) {
	            System.out.print("English ");
	        }
	        if (physics == max) {
	            System.out.print("Physics ");
	        }
	        if (programming == max) {
	            System.out.print("Programming ");
	        }
	        System.out.println("courses).");
	 
	        System.out.print("Min score is: " + min + " (");
	        if (math == min) {
	            System.out.print("Math ");
	        }
	        if (english == min) {
	            System.out.print("English ");
	        }
	        if (physics == min) {
	            System.out.print("Physics ");
	        }
	        if (programming == min) {
	            System.out.print("Programming ");
	        }
	        System.out.println("courses).");
	 
	        System.out.println("Average score of this student is: " + average);
	    }
	
}


