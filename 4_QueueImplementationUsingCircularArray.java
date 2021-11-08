
// Implementation of Deque using circular array
//Circular array implementation deque 
// For implementing deque, we need to keep track of two indices, front and rear. 
// We enqueue(push) an item at the rear or the front end of qedue and dequeue(pop) an item from both rear and front end.



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
