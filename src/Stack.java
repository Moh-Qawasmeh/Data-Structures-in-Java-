public interface Stack<T> extends Iterable<T> {
    public void push(T item);

    public void pop();

    public int size();

    public boolean isEmpty();

    public T top();

    public boolean isFull();

    public void clear();

}
