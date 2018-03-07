package list;

import java.util.NoSuchElementException;

public class CustomList<T> {
    private Node head;

    public CustomList() {
        head = null;
    }

    public void addAtTail(T data) {

        if (head == null) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    public void addAtHead(T data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void addAtIndex(int index, Object dat) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
    }

    public T getAtIndex(int index) throws NoSuchElementException {
        Node temp = head;

        for (int i = 0; i <= index && temp != null; i++) {

            if (i == index) {
                return (T) temp.data;
            }

            temp = temp.next;
        }

        throw new NoSuchElementException("No element at index.");
    }

    public void deleteAtIndex(int index) {
        Node temp = head;

        for(int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public int size() {
        int counter = 0;
        Node temp = head;

        if (head == null) {
            return counter;
        } else {
            counter++;
        }

        while (temp.next != null) {
            counter++;
            temp = temp.next;
        }

        return counter;
    }
}

class Node<T> {
    public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
