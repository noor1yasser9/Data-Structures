// ** Types of Linked list
//   1- Singly Linked list  is the commonly used linked list in programs.
//   2- Doubly Linked list  As the name suggests, the doubly linked list contains two pointers.
//   3- Circular Linked list  is a variation of a singly linked list.
//   4- Doubly Circular Linked list  has the features of both the circular linked list and doubly linked list.



# Singly linked lists.

**singly linked list is a linear data structure in which each element of the list contains a pointer which points to the next element in the list.**

- **Example Code**
    ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/390a379c-dd27-40f9-b0b9-0702da05f23d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220713%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220713T154328Z&X-Amz-Expires=86400&X-Amz-Signature=eba4cbac84fc25199800c6df1bbf4de861e440c294fa2fe5752fd3f0d00ada7d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
    
    - Linked List can be defined as a collection of objects called nodes that are randomly stored in the memory.
    - A node contains two fields, i.e. data stored at that particular address and the pointer which contains the address of the next node in the memory.
    - The last node of the list contains the pointer to the null.
    
    ```java
    public class LinkedListExamples  
    {  
     Node head;  // head of list  
     static class Node {  
     int data;  
             Node next;  
     Node(int d)  { data = d;  next=null; }  
         }  
         /* This function prints contents of the linked list starting from head */  
     public void display()  
         {  
             Node n = head;  
     while (n != null)  
             {  
     System.out.print(n.data+" \n");  
                 n = n.next;  
             }  
         }  
         /* method to create a simple linked list with 3 nodes*/  
     public static void main(String[] args)  
         {  
             /* Start with the empty list. */  
     LinkedListExamples list = new LinkedListExamples();  
      
     list.head       = new Node(100);  
             Node second      = new Node(200);  
             Node third       = new Node(300);  
      
     list.head.next = second; // Link first node with the second node  
     second.next = third; // Link first node with the second node  
     list.display();  
         }  
    }
    ```
