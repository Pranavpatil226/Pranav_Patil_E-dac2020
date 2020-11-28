package Lecture;

import java.util.Scanner;

class Quick
{
	Scanner sc=new Scanner(System.in);
	
	void swap(int s,int e)
	{
		int temp;
		temp=s;
		s=e;
		e=temp;
	}
	
	void quickSorting(int[] arr,int lb,int ub)
	{
		if(lb<ub)
		{
			System.out.println("lb quick"+lb);
			System.out.println("ub quick"+ub);
			int loc=partition(arr,lb,ub);
			System.out.println("loc quick"+loc);
			quickSorting(arr, lb, loc-1);
			
			quickSorting(arr, loc+1, ub);
			
		}
	}
	
	int partition(int[] arr,int lb,int ub)
	{
		int pivot,start,end;
		pivot=arr[lb];
		System.out.println("Pivot = "+pivot);
		start=lb;
		end=ub;
		
		while(start<end)
		{
			while(arr[start]<=pivot)
			{
				System.out.println("start ele"+start);
				start++;
				if(start==arr.length-1)
				{
					break;
				}
			}
			while(arr[end]>pivot)
			{
				System.out.println("end ele"+end);
				end--;
			}
			if(start<end)
			{
				int temp;
				System.out.println("arr[start]  "+arr[start]);
				System.out.println("arr[end]  "+arr[end]);
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				System.out.println("arr[start]  "+arr[start]);
				System.out.println("arr[end]  "+arr[end]);

				
				//swap(arr[start],arr[end]);
			}
		}
		
		//swap
		int temp;
		System.out.println("arr[start] outer "+arr[start]);
		System.out.println("arr[end] outer "+arr[end]);
	    temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		System.out.println("arr[start] outer "+arr[start]);
		System.out.println("arr[end] outer "+arr[end]);
		//swap(arr[lb],arr[end]);
		return end;
	}
	
	void accept(int[] arr,int n)
	{
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
	}
	
	void display(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
}


public class QuickSort {

	public static void main(String[] args) {
		
		Quick q=new Quick();
		int n=6;
		int[] arr=new int[n];
		
		int lb=0,ub=n-1;
		q.accept(arr,n);
		q.display(arr,n);
		q.quickSorting(arr,lb,ub);
		System.out.println("quick sort o.p is : ");
		q.display(arr,n);
		
		
		

	}

}
