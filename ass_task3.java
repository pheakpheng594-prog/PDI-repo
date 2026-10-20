package assigment;
import java.util.Scanner;

public class ass_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,num4,num5, max=0,min=0;
		
		System.out.println("Input: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		max=num1;
		if(max<num2) {
			max=num2;
			
		}
		if(max<num3) {
			max=num3;
		}
		if(max<num4) {
			max=num4;
		}
		if(max<num5) {
			max=num5;
		}
		
		min=num1;
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		if(min>num4) {
			min=num4;
		}
		if(min>num5) {
			min=num5;
		}
		
		
		
			System.out.println();
			System.out.println("Output:");
			System.out.println("Among all the five input numbers ("+num1+ ", "+num2+", "+num3+", "+num4+", "+num5+"),");
			System.out.print("min is "+min+" and max is "+max);
			
			sc.close();
			
		}
		
		

	}


