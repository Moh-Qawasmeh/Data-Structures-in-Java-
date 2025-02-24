public interface Queue<T> extends Iterable<T> {

    public void enqueue(T item);

    public T dequeue();

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public T front();

    public void clear();

}
