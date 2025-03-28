package Generics.GenericClass;

import java.util.List;

public class Container<T> {
    private List<T> items;
    public Container(List<T> items) {
        this.items = items;
    }
    public T getItem(int index) {
        return items.get(index);
    }
    public void addItem(T item){
        items.add(item);
    }
    public int getSize(){
        return items.size();
    }
}
