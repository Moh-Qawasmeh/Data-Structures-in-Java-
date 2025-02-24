import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aqueue<T> extends Resize<T> implements Queue<T> {

    private int front;
    private int rear;

    Aqueue(){
        super();
        front = 0;
        rear = 0;
    }

    @Override
    public void enqueue(T item) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T front() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
