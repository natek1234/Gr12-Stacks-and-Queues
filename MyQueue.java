//Author: Ketan Vasudeva
//Class: ICS4U1
//Purpose: Creates a queue class.
public class MyQueue implements Queue {

	//Creates two nodes, one for front and one for back of queue.
	Node front;
	Node back;
	
	//Initializes front and back nodes.
	public MyQueue()
	{
		front = null;
		back = null;
	}
	//Adds item to the back of the queue.
	public void enqueue(Object item) 
	{
		
		if(front == null)
		{
			front = new Node(item); 
			back = front;
		}
		else
		{
			back = back.getNext();
			back = new Node(item);
		}
	}

	//Removes and returns item from the front of queue.
	public Object dequeue()
	{
		if(front == back)
		{
			Node n = front;
			front = null;
			back = null;
			return n.getItem();
		}
		if(front != null)
		{
			Node n = front;
			front = front.getNext();
			return n.getItem();
		}
		return null;
	}


	//Checks if queue is empty.
	public boolean isEmpty() {
		if(front == null)
		{
			return true;
		}
		return false;
	}

	//Returns size of queue.
	public int size() {
		int count = 1;
		Node n = front;
		if(front == null)
		{
			return 0;
		}
		else
		{
			while(!n.equals(back))
			{
				count++;
				n = n.getNext();
			}
			return count;
		}

	}

}
