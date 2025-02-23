import java.util.Arrays;
import java.util.Iterator;

public class Astack<T> implements Stack<T> {

    private T arr[];
    private int size;
    private int current;
    private final int MAXIMUM = 100000;

    public Astack(){
        size = 4;
        arr = (T[]) new Object[size];
        current = 0;
    }

    public void resize(boolean inc){
        if(inc == true){
            size = Math.min(size *2, MAXIMUM);
        }
        else size /= 2;
        arr = Arrays.copyOf(arr, size);
    }

    @Override
    public void push(T item){
         if(current == size - 1){
             resize(true);
         }
         arr[current++] = item;
    }
    @Override
    public void pop(){
        if(!isEmpty()) {
            arr[current] = null;
            current--;
            if(current < size / 4){
                resize(false);
            }
        }
    }
    @Override
    public int size(){
       return current;
    }
    @Override
    public boolean isEmpty(){
        return current == 0;
    }
    @Override
    public T top(){
        return arr[current];
    }
    @Override
    public boolean isFull(){
        return current + 1 == MAXIMUM;
    }
    @Override
    public void clear(){
       for(int i = 0; i < size; i++ ){
           arr[i] = null;
       }
       current = 0;
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
