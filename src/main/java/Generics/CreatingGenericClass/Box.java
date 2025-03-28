package Generics.CreatingGenericClass;

public class Box<T> {
    private T item;

    public Box(T item){
        this.item = item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}
