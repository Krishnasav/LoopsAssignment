package loopsAssignment;

import java.util.Scanner;

public class MultiplicationTableN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " * " + i + " = " +(n * i));
        }
    }
	}
