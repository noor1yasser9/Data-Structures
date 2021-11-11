
class ArrayListType {

    private int[] list;
    private int length = 0,
            maxSize;

    public ArrayListType(int maxSize) {
        this.maxSize = maxSize;

        list = new int[maxSize];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return maxSize == length;
    }

    public int getSize() {
        return length;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("]");
    }

    public void insertAtPos(int pos, int element) {
        if (isFull()) {
            System.out.println("List is Full");
            return;
        }
        if (pos < 0 || pos >= length) {
            System.out.println("Out of Range");
            return;
        }
        for (int i = length; i < pos; i--) {
            list[i] = list[i - 1];
        }
        list[pos] = element;
        length++;
    }

    public void insertAtEnd(int element) {
        if (isFull()) {
            System.out.println("List is Full");
            return;
        }
        list[length] = element;
        length++;
    }

    public int search(int element) {
        for (int i = 0; i < length; i++) {
            if (list[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void insertNoDuplicate(int element) {
        if (search(element) == -1) {
            insertAtEnd(element);
        } else {
            System.out.println("The Element is there ...! " + element);
        }
    }

    public void updateAt(int pos, int element) {
        if (pos < 0 || pos >= length) {
            System.out.println("Out of Range");
        } else {
            list[pos] = element;
        }
    }

    public int getElement(int pos) {
        if (pos < 0 || pos >= length) {
            System.out.println("Out of Range");
        } else if (isEmpty()) {
            System.out.println("List is empty");
        }
        return list[pos];
    }

    public void deleteList() {
        list = T[maxSize];
    }

    public void clear() {
        length = 0;
    }

    public boolean removeAtPos(int pos) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }
        if (pos < 0 || pos >= length) {
            System.out.println("Out of Range");
            return false;
        }
        for (int i = pos; i < length; i++) {
            list[i] = list[i + 1];
        }
        length--;
        return true;

    }

}
