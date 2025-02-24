import java.util.Arrays;

abstract public class Resize<T> {

    protected T arr[];
    protected int size;
    protected final int MAXIMUM = 100000;

    public Resize(){
        size = 2;
        arr = (T[]) new Object[size];
    }

    public void resize(boolean inc){
        if(inc == true){
            size = Math.min(size *2, MAXIMUM);
        }
        else size /= 2;
        arr = Arrays.copyOf(arr, size);
    }


}
