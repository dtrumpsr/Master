import java.util.EmptyStackException;


public class LinkedQueue<T> implements Queue<T> {

    private int total;

    private Node first, last;

    private class Node {
        private T ele;
        private Node next;
    }

    public LinkedQueue() { }

    public void enqueue(T ele)
    {
        Node current = last;
        last = new Node();
        last.ele = ele;

        if (total++ == 0) first = last;
        else current.next = last;

        
    }

    public T dequeue()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        if (--total == 0) last = null;
        return ele;
    }

   
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}