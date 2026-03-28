package generics;

public class Myqueue <E> {

    private class Node{
        E data;
        Node next = null;
        Node(E d) {data = d;}
    }
    private Node head, tail;

    public Myqueue(){
        head = tail = null;
    }
    public void enqueue(E d){
        if(head == null)
            head = tail = new Node(d);
        else
            tail = tail.next = new Node(d);
    }

    public E dequeue(){
        E d = head.data;
        if((head = head.next) == null) tail  = null;
        return d;
    }
    public boolean empty(){
        return head == null;
    }
}
