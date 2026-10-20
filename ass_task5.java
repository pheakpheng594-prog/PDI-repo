package assigment;
import java.util.Scanner;

public class ass_task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input n: ");
	        int n = input.nextInt();
	 
	        System.out.print("All prime numbers from 2 to " + n + ": ");
	 
	        for (int number = 2; number <= n; number++) {
	 
	            boolean isPrime = true;
	 
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;  
	                    break;
	                }
	            }
	 
	            if (isPrime) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	}