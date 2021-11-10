


class Node<T> {

    T item;
    Node next;

    public Node(T item) {
        this.item = item;
    }
}

class LinkedQueue<T> {

    private Node<T> next = null,
            frontPtr = null,
            rearPtr = null;
    private int length = 0;
    
     boolean isEmpty() {
        return length == 0;
    }
    
    T front() {
        assert !isEmpty();
        return frontPtr.item;
    }

    T rear() {
        assert !isEmpty();
        return rearPtr.item;
    }
    
    void enqueue(T item) {
        Node<T> node = new Node<T>(item);
        if (length == 0) {
            this.frontPtr = this.rearPtr = node;
        }
        this.rearPtr.next = node;
        this.rearPtr = node;
        length++;
    }
    
    void dequeue() {
        if (isEmpty()) {
            return;
        }
        this.frontPtr = this.frontPtr.next;
        if (this.frontPtr == null) {
            this.rearPtr = null;
        }

        length--;
    }

    void clearQueue() {
        frontPtr = null;
    }

    void display() {
        Node<T> cur = frontPtr;
        System.out.print("[ ");
        while (cur != null) {
            System.out.print(cur.item + " ");
            cur = cur.next;
        }
        System.out.println("]");
    }

    int getSize() {
        return length;
    }
}
