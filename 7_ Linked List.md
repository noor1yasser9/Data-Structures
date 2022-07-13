# Types of Linked list
- Singly Linked list  is the commonly used linked list in programs.
- Doubly Linked list  As the name suggests, the doubly linked list contains two pointers.
- Circular Linked list  is a variation of a singly linked list.
- Doubly Circular Linked list  has the features of both the circular linked list and doubly linked list.



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


# Doubly linked lists.

**Doubly Linked List is a type of Linked List where each node apart from storing data has two links.**

- **Example Code**
    
    ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/860793d4-c48c-4ecd-87dd-84979c1c168b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220713%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220713T170141Z&X-Amz-Expires=86400&X-Amz-Signature=47dc4b206977ebd649f0c40cd4298d0621bd35c4d981b9431f9be721a48b0864&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
    
    - Define a Node class which represents a node in the linked list. It should have 3 properties i.e. previous node, data, and the next node
    - Define another class to create a Doubly Linked List with two nodes i.e head and tail. Initially these values will be null.
    - Create a function for adding nodes in the linked list,
    - It will first check whether head is null and then insert node as head.
    - Both head and tail will then point to the new node.
    - If the tail is not null, the new node will be inserted at the list end in such a way that the pointer of the new node will point to the tail.
    - Thus, the new node will become a new tail.
    
    ```java
    public class DLL {
        class Node{
            public int data;
            public Node prevNode;
            public Node nextNode;
            public Node(int data) {
             this.data = data;
            }
        }
    public void displayNode() {
            Node tempNode = headNode;
            while (tempNode != null) {
                System.out.print(tempNode.data + "–>");
                tempNode = tempNode.nextNode;
            }
            System.out.println("END");
        }
        Node headNode, tailNode = null;
            public void addNode(int data) {
            Node newNode = new Node(data);
            if(headNode == null) {
                headNode = tailNode = newNode;
                headNode.prevNode = null;
                tailNode.nextNode = null;
            }
            else {
                tailNode.nextNode = newNode;
                newNode.prevNode = tailNode;
                tailNode = newNode;
                tailNode.nextNode = null;
            }
        }
        public void deleteInitialNode() {
            if(headNode == null) {
                System.out.println("Doubly Linked List is empty");
                return;
            }
            else {
                if(headNode != tailNode) {
                    headNode = headNode.nextNode;
                }
                else {
                    headNode = tailNode = null;
                }
            }
        }
        void printNode() {
            Node currNode = headNode;
            if(headNode == null) {
                System.out.println("Doubly Linked List is empty");
                return;
            }
            while(currNode != null)
            {
                System.out.print(currNode.data + " ");
                currNode = currNode.nextNode;
            }
                System.out.println();
            }
            public static void main(String[] args) {
                DLL doublyLL = new DLL();
                doublyLL.addNode(3);
                doublyLL.addNode(5);
                doublyLL.addNode(7);
                doublyLL.addNode(9);
                doublyLL.addNode(11);
                System.out.println("Doubly linked list: ");
                doublyLL.printNode();
                doublyLL.addNode(15);
                doublyLL.addNode(17);
                doublyLL.addNode(19);
                doublyLL.deleteInitialNode();
                doublyLL.addNode(21);
                System.out.println("Doubly Linked List after deleting at the beginning: ");
                doublyLL.printNode();
        }
    }
    ```
    
    # Circular linked lists.

**circular linked list is a variation of a linked list in which the last node points to the first node, completing a full circle of nodes.**

- **Example Code**
    
    ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e32d2f20-ccd1-4751-8a8d-c4d2db83222f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220713%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220713T181538Z&X-Amz-Expires=86400&X-Amz-Signature=bd0365b5de0a45db4d72324bd738b18bbfba5148bffe0da8fa0aed363a46306e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
    
    - Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
    - Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: add() and display() .
    - add() will add the node to the list:
        - It first checks whether the head is null, then it will insert the node as the head.
        - Both head and tail will point to the newly added node.
        - If the head is not null, the new node will be the new tail, and the new tail will point to the head as it is a circular linked list.
    
    a. display() will show all the nodes present in the list.
    
    - Define a new node 'current' that will point to the head.
    - Print current.data till current will points to head
    - Current will point to the next node in the list in each iteration.
    
    ```java
    public class CreateList {  
        //Represents the node of list.  
        public class Node{  
            int data;  
            Node next;  
            public Node(int data) {  
                this.data = data;  
            }  
        }  
      
        //Declaring head and tail pointer as null.  
        public Node head = null;  
        public Node tail = null;  
      
        //This function will add the new node at the end of the list.  
        public void add(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            //Checks if the list is empty.  
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                //tail will point to new node.  
                tail.next = newNode;  
                //New node will become new tail.  
                tail = newNode;  
                //Since, it is circular linked list tail will point to head.  
                tail.next = head;  
            }  
        }  
      
        //Displays all the nodes in the list  
        public void display() {  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
                System.out.println("Nodes of the circular linked list: ");  
                 do{  
                    //Prints each node by incrementing pointer.  
                    System.out.print(" "+ current.data);  
                    current = current.next;  
                }while(current != head);  
                System.out.println();  
            }  
        }  
      
        public static void main(String[] args) {  
            CreateList cl = new CreateList();  
            //Adds data to the list  
            cl.add(1);  
            cl.add(2);  
            cl.add(3);  
            cl.add(4);  
            //Displays all the nodes present in the list  
            cl.display();  
        }  
    }
    ```
