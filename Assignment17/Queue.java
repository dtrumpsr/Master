
public interface Queue<T> {
    void enqueue(T ele);
    T dequeue();
}