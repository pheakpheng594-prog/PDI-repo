package assigment;
import java.util.Scanner;

public class ass_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		double delta, x1, x2;
		
		System.out.println("=============================================");
		System.out.println("         Welcome to our program              ");
		System.out.println("'Quadratic Equation Solver ax^2 + bx + c = 0 ");
		System.out.println("=============================================");
		System.out.println("");
		System.out.println("");
		
		System.out.print("Input a: ");
		num1 = sc.nextInt();
		
		System.out.print("Input b: "); 
		num2 = sc.nextInt();
		
		System.out.print("Input c: ");
		num3 = sc.nextInt();
		
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------");
		
		System.out.print("Roots of this equation: "+num1+"x^2 +"+num2+"x +"+num3+" = 0");
		
		delta = (num2*num2) - 4*num1*num3;
		x1 = (-num2 + Math.sqrt(delta))/2*num1;
		x2 = (-num2 - Math.sqrt(delta))/2*num1;
		
		System.out.println();
		System.out.println("	X1= "+x1);
		System.out.println("	X2= "+x2);
		
		System.out.println("----------------------------------------------");
		sc.close();
		
	}
	
	
}
