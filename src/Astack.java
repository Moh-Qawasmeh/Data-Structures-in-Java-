import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Astack<T> extends Resize<T> implements Stack<T> {

    private int current;

    public Astack(){
        super();
        current = 0;
    }

    @Override
    public void push(T item){
         if(item == null){
             throw new IllegalArgumentException();
         }
         if(isFull()){
             throw new StackOverflowError();
         }
         if(current == size){
             resize(true);
         }
         arr[current++] = item;
    }

    @Override
    public void pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        arr[current - 1] = null;
        current--;
        if(current < size / 4){
            resize(false);
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
        return current == MAXIMUM;
    }

    @Override
    public void clear(){
       for(int i = 0; i < size; i++ ){
           arr[i] = null;
       }
       size = 8;
       resize(false);
       current = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
