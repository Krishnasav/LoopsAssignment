package loopsAssignment;
import java.util.Scanner;
public class Sumofnaturalnumbers {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer 'n': ");
	        int n = sc.nextInt();
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else 
	        {
	            int sum = 0;
	            for (int i = 1; i <= n; i++) {
	                sum += i;
	            }
	            System.out.println("Sum of natural numbers is: " + sum);
	        }
}

}