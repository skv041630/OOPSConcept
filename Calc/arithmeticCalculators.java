package Calc;
import java.util.Scanner;

public class arithmeticCalculators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		int a=sc.nextInt();
		System.out.println("Please enter Second number:");
		int b=sc.nextInt();
		System.out.println("Please select the Arithmetic Operation you want to execute: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice=sc.nextInt();
		if (choice==1) {
		add(a,b);
		}
		else if (choice==3) {
		multi(a,b);}
		else if (choice==2) {
		sub(a,b);
		}
		else if (choice==4){
		div(a,b);
		}
		else System.out.println(+choice +" is not a valid choice, please check options and try again ");
		
	}
	
public static void add (int x, int y) {
	int sum=x+y;
	System.out.println("Sum of the given number is : "+sum);
}
private static void multi (int x, int y) {
	int mul=x*y;
	System.out.println("Product/Multiplication of the given number is : "+mul);
}
public static void sub (int x, int y) {
	int sub=x-y;
	System.out.println("Subtraction of the given number is : "+sub);

}
private static void div (int x, int y) {
	int division;
	if (x>y) {
	division=x/y;
	} else division=y/x;
	System.out.println("Division of the given number is : "+division);
}
}
