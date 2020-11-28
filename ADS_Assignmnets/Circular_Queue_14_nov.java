package Lecture;

class Queue6
{
	int front=-1;
	int rear=-1;
	int max=5;
	int qarr[]=new int[max];
	
	
	void enqueue(int x)
	{
		if(front==(rear+1)%max)
		{
			System.out.println("full");
		}
		else
		{
			rear=(rear+1)%max;
			qarr[rear]=x;
			System.out.println("Inserted element :"+qarr[rear]+"rear"+rear);
			if(front==-1)
			{
				front=0;
			}
		}
	}
	
	void dequeue()
	{
		int val;
		if(rear==-1 && front==rear)
		{
			System.out.println("empty");
		    
		}
		else
		{
			val=qarr[front];
			if(front==rear)
			{
				front=rear=-1;
			}
			else
			{
			front=(front+1)%max;
			System.out.println("deleted element :"+val+"front"+front);
			}
			}
	}
}
public class Circular_Queue_14_nov {

	public static void main(String[] args) {
		Queue6 q=new Queue6();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(70);
		q.enqueue(70);
		q.enqueue(70);
		q.enqueue(70);
	}

}
