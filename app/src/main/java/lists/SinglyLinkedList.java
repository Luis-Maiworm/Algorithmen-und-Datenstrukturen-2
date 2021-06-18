package lists;


public class SinglyLinkedList<T> implements IListable<T> {

    private Node head = null;

    private class Node {
        T data;
        Node next;
    }

    private boolean isInvalidIndexRange(int index) {
        return index < 0 || index >= size();
    }

    @Override
    public void add(T data) {
        addLast(data);
    }

    @Override
    public void insert(int index, T data) {
        // TODO Auto-generated method stub
        Node node = new Node();
        node.data = data;
        node.next = null;

        if ((head == null) || isInvalidIndexRange(index)) {
            head = node;
        } else {
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    @Override
    public T get(int index) {
        if ((head == null) || isInvalidIndexRange(index)) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public void set(int index, T data) {
        // TODO Auto-generated method stub
        insert(index, data);
        remove(index+1);
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int size() {
        // Variante I
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
        // Variante II - TODO: Increment and decrement counter for size
    }

    @Override
    public void addLast(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    @Override
    public void addFirst(T data) {
        // TODO Auto-generated method stub
        Node node = new Node();
        node.data = data;

        node.next = head;
        head = node;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        if (head == null) {
            return;
        }
        Node temp = head;
        if (index == 0){
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < index-1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null){
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    @Override
    public void removeLast() {
        // TODO Auto-generated method stub
        if (head == null){
            return;
        }
        if (head.next == null){
            return;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

    }

    @Override
    public void printAll() {
        Node temp = head;
        while (temp != null ) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}