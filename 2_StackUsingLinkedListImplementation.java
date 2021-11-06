
 class Stak<T>{
     class Node<T>{
        T item; 
        Node next;
    }
    Node top , cur = null; 
    void push(T newItem){
        Node newItemPtr = new Node();
        newItemPtr.next = top;
        top  = newItemPtr;
    }
    
    void pop(T itemD){
            if(isEmpty())
            System.out.println("Stak empty on pop");
            
            else{
                Node temp = top;
                top = top.next;
                temp = temp.next = null;
            }
    }
    
    void display(){
        cur = top ;
        System.out.print("[ ");
        while(cur !=null){
            System.out.print(cur.item+" ");
            cur = cur.next;
        }
        System.out.print("]");
    }
    boolean isEmpty(){
        return top == null;
    }
    

}


public class Main
{
	public static void main(String[] args) {
		Stak<String> aa = new Stak<String>();
		aa.push("100");
		aa.display();
	}
}
