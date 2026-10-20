package assigment;
import java.util.Scanner;
public class ass_task1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum=0;
		double average=0;
		System.out.print("Imput:");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("	Enter a number: ");
		num = sc.nextInt();
		
		System.out.println("");
		System.out.println("Output:");
		
		for (int i=1000 ; i>num ; i-- ) {
			System.out.print(i+" ");
		
			sum += i;
			average = sum / (1000-i+1);
			
		}
		
		System.out.println("");
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+average);
		
	sc.close();
	
	
	}

}
