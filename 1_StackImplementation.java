 class Stak{
      int  MAX_SIZE = 100;
      String EMPTY_STACK = "Stack empty on pop";
    int top = -1 ; 
     String[] item = new String[MAX_SIZE];
    
    int itemTop;
     void push(String element){
         if(top>=MAX_SIZE-1){
             System.out.println("Stack full on push");
         }else {
             top ++ ; 
             item[top] = element;
         }
     }
     
     void pop(){
          if(isEmpty()){
              System.out.println(EMPTY_STACK);
          }else{
              top--;
          }
     }
     
     String pops(){
          if(isEmpty()){
            return EMPTY_STACK;
          }else{
              int temp = top; 
              top--;
              return item[temp];
          }
     }
     
     String getTop(){
         if(isEmpty()){
         return EMPTY_STACK;
         }else{
           return item[top];
         }
     }
     
     void display(){
           if(isEmpty()){
           System.out.println(EMPTY_STACK);
         }else{
                    System.out.print("[");

             for(int i = top; i>=0; i--){
                   System.out.print(item[i]+" ");   
             }
              System.out.print("]");
         }
     }
     boolean isEmpty(){
         return top < 0;
     }
 }


public class Main
{
	public static void main(String[] args) {
		Stak aa = new Stak();
		aa.push("100");
		aa.push("100234");
		aa.display();
		System.out.println("");
		System.out.println(aa.getTop());
	    System.out.println(aa.pops());
	    aa.display();
	}
}
