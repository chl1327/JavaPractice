package JavaAdvanced.BaseMode;

/**
 * Created by chl1327 on 2017/11/26.
 */
public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void print(){
        list.stream().forEach(item->System.out.println(item));
    }
}