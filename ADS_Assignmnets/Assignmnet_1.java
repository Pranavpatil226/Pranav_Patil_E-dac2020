package Assignments;

import java.util.Scanner;

// factorial using iteration
/*
public class Assignmnet_1 
{
	int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int n=sc.nextInt();
     Assignmnet_1 a1=new Assignmnet_1();
     System.out.println(a1.fact(n));;
     
     
	}

}
*/

/*
//factorial using recursion
public class Assignmnet_1 
{
	double fact_r(int n)
	{
		if(n>=1)
		{
			return n*fact_r(n-1);
		}
		else
		{
		return 1;
		}
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     Assignmnet_1 a1=new Assignmnet_1();
     System.out.println(a1.fact_r(n));;
     
     
	}

}
*/


public class Assignmnet_1 
{
	int fibo_r(int n)
	{
	
		 if(n==0||n==1)
		{
			return n;
		}
		else
			return fibo_r(n-1)+fibo_r(n-2);
					
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     Assignmnet_1 a1=new Assignmnet_1();
     System.out.println(a1.fibo_r(n));;
     
     
	}

}

/*
//fibonacci using iteration
public class Assignmnet_1 
{
	int fibo_i(int n)
	{
		int fib=0;
		int a=0;
		int b=1;
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		for(int i=1;i<n;i++)
		{
			fib=a+b;
			a=b;
			b=fib;
		}
		return fib;
					
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     Assignmnet_1 a1=new Assignmnet_1();
     System.out.println(a1.fibo_i(n));;
     
     
	}

}
*/
/*
public class Assignmnet_1 
{

	int sum_i(int n)
	{
		for(int i=1;i<=n;i++)
		{
			
		}
		return 0;
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     Assignmnet_1 a1=new Assignmnet_1();
     System.out.println(a1.sum_i(n));;
     
     
	}

}
*/