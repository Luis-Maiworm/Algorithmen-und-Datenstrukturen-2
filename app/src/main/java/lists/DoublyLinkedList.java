package lists;

public class DoublyLinkedList<T> implements IListable<T> {

    private Node head = null;
    private Node tail = null;

    private class Node {
        T data;
        Node next;
        Node prev;
    }

    @Override
    public void add(T data) {
        addLast(data);
    }

    @Override
    public void insert(int index, T data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;

        if (index < 0){
            // TODO Exception?
            return;
        }
        if (index == 0){
            node.next = head;
            head.prev = node;
            head = node;
        } else{
            Node temp = new Node();
            temp = head;
            for (int i = 0; i < index-1; i++){
                if (temp != null){
                    temp = temp.next;
                }
            }

            if (temp != null){
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
                if (node.next != null){
                    node.next.prev = node;
                } else {
                    // TODO exception?
                    return;
                }
            }
        }




    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        Node temp = head;

        if ((head == null) || (index < 0)) {
            return null;
        }

        for (int i = 0; i < index; i++){
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
        tail = null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        Node temp = head;

        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public void addLast(T data) {
        Node node = new Node();
        node.data = data;

        if (head == null){
            head = tail = node;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }


    }

    @Override
    public void addFirst(T data) {
        // TODO Auto-generated method stub
        Node node = new Node();
        node.data = data;

        node.next = head;
        node.prev = null;

        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        if (head == null || index < 0){
            return;
        }
        Node temp = head;

        for (int i = 0; temp != null && i < index; i++){
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        if (head == temp){
            head = temp.next;
        }
        if (temp.next != null){
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null){
            temp.prev.next = temp.next;
        }
        temp = null;
    }

    @Override
    public void removeLast() {
        // TODO Auto-generated method stub
        if (head != null){
            if (head.next == null){
                head = null;
            } else {
                Node temp = new Node();
                temp = head;
                while (temp.next.next != null){
                    temp = temp.next;
                }
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }

    }

    @Override
    public void printAll() {
        // TODO Auto-generated method stub
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}