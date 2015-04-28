import java.util.EmptyStackException;



public class CircularArrayQueue<T> implements Queue<T>
{
private final int DEFAULT_CAPACITY = 100;
private int front, rear, count;
private T[] queue; 


public CircularArrayQueue()
{
  front = rear = count = 0;
  queue = (T[]) (new Object[DEFAULT_CAPACITY]);
}


public CircularArrayQueue (int initialCapacity)
{
  front = rear = count = 0;
  queue = ( (T[])(new Object[initialCapacity]) );
}


public void  enqueue (T element)
{
  if (size() == queue.length) 
     expandCapacity();

  queue[rear] = element;

  rear = (rear+1) % queue.length;

  count++;

}


public T dequeue() throws EmptyStackException
{
  

  T result = queue[front];
  queue[front] = null;

  front = (front+1) % queue.length;

  count--;

  return result;
}


public T first() throws EmptyStackException
{
  

  return queue[front];
}


public boolean isEmpty()
{
  return (count == 0);
}


public int size()
{
  return count;
}



public void expandCapacity()
{
T[] larger = (T[])(new Object[queue.length *2]);   

for(int scan=0; scan < count; scan++)
{
  larger[scan] = queue[front];
  front=(front+1) % queue.length;
}

front = 0;
rear = count;
queue = larger;
}
}
