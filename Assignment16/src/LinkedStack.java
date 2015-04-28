import java.util.NoSuchElementException;



public class LinkedStack<T> implements Stack<T> {
    private class Node<T> {
        public T data;
        public Node<T> next;
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top = null;

    public void push(T item) {
        top = new Node<T>(item, top);
        
    }

    public T pop() {
        T item = peek();
        top = top.next;
        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    public int size() {
        int count = 0;
        for (Node node = top; node != null; node = node.next) {
            count++;
        }
        return count;
    }
    
  
}