package assigment;

import java.util.Scanner;

public class ass_task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String date = input.nextLine();
 

        String[] parts = date.split("-");
 
        if (parts.length != 3) {
            System.out.println("Output: invalid");
            return;
        }
 
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
 
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 
        int daysInMonth;
        if (month == 2) {
            if (leapYear) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
 
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth) {
            System.out.println("Output: invalid");
        } else {
            System.out.println("Output: valid");
        }
	}
}