public interface Queue<T> {
    public void enqueue(T item); // add an item to the tail of the queue
    public T dequeue(); // remove the item at the head and return it

    public int size();
    public boolean isEmpty();
}
