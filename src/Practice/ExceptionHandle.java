package Practice;

import java.util.Scanner;

class InvalidAge extends RuntimeException
{
	public InvalidAge(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}




public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=sc.nextInt();
		try {
		if(age<18)
		{
			throw new ArithmeticException("Your not allowed to vote");
		}
		else
		{
			System.out.println(" Your allowed to vote");
		}
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("hello");
	}

}
