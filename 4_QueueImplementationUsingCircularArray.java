
// Implementation of Deque using circular array
//Circular array implementation deque 
// For implementing deque, we need to keep track of two indices, front and rear. 
// We enqueue(push) an item at the rear or the front end of qedue and dequeue(pop) an item from both rear and front end.

// Time Complexity: Time complexity of enQueue(), deQueue() operation is O(1) as there is no loop in any of the operation.
// Applications: 
	// Memory Management: The unused memory locations in the case of ordinary queues can be utilized in circular queues.
	// Traffic system: In computer controlled traffic system, circular queues are used to switch on the traffic lights one by one repeatedly as per the time set.
	// CPU Scheduling: Operating systems often maintain a queue of processes that are ready to execute or that are waiting for a particular event to occur.

import java.util.*;

class ArrayQueueTypeMain {
    public static void main(String[] args) {
    ArrayQueueType q1 = new ArrayQueueType(5);
	q1.addQueue(10);
	q1.addQueue(20);
	q1.addQueue(30);
	q1.addQueue(40);
	q1.addQueue(50);
	q1.deleteQueue();
	q1.printQueue();
	System.out.println(q1.frontQueue());
	System.out.println(q1.rearQueue());
	System.out.println(q1.queueSearch(30));
    }
}

class ArrayQueueType{
  int rear;
	int front;
	int length;
	int maxSize;
	int[] arr;
	
	
  public ArrayQueueType(int size){
    maxSize  = size <= 0?100:size;
    arr= new int[maxSize];
    front = 0;
    rear = maxSize - 1;
    length = 0;
	}
	
	public boolean isEmpty(){
    return length == 0;
	}
	
	public boolean isFull(){
		return length == maxSize;
	}
	
	public void addQueue(int element){
    if (!isFull()){
      rear = (rear + 1) % maxSize;    
      arr[rear] = element;
      length++;
    }else{
      System.out.println("Queue Full Can't Enqueue ...!");
    }
  }
  
  public void deleteQueue(){
    if (!isEmpty()){
      front = (front + 1) % maxSize;
      --length;
    }else{
      System.out.println("Empty Queue Can't Dequeue ...!");
    }
  }
	
	public int frontQueue(){
    assert !isEmpty();
    return arr[front];
  }
  
	public int rearQueue(){
		assert !isEmpty();
		return arr[rear];
	}
  
	public void printQueue(){
    if(!isEmpty()) {
      for (int i = front; i != rear; i = (i + 1) % maxSize){
        System.out.print( arr[i] + " ");
      }
    }
	}
  
	public int queueSearch(int element) {
    int pos = -1;
		if(!isEmpty()){
      for (int i = front; i != rear; i = (i + 1) % maxSize){
        if (arr[i] == element){
          pos = i;
          break;
        }
      }
      if (pos == -1){
        if (arr[rear] == element){
          pos = rear;
        }
      }	
    }
    return pos;
	}
}
