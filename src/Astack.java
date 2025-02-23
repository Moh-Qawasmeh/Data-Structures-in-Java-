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

    }

    public void push(T item){
         if(current == size - 1){
             resize(true);
         }
         arr[current++] = item;
    }
    // add a new item to the top
    public void pop(){
        if(!isEmpty()) {
            arr[current] = null;
            current--;
            if(current < size / 4){
                resize(false);
            }
        }
    }
    // remove the item located at the top and return it
    public int size(){
       return current;
    }

    public boolean isEmpty(){
        return current == 0;
    }

    public T top(){
        return arr[current];
    }

    public boolean isFull(){
        return current + 1 == MAXIMUM;
    }

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
