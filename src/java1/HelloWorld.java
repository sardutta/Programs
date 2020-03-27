package java1;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
		System.out.println( a +" is greater than "+ b);
		}
		else
			System.out.println( b +" is greater than "+ a);
		
		System.out.println("exiting the program");
		System.out.println("abcs");
		
	}

}
