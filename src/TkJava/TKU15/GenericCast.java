package TkJava.TKU15;

import java.util.ArrayList;

class FixedSizeStack<T>{
    private ArrayList<T> storage = new ArrayList<T>();
    public int count() {
        return storage.size();
    }
    public void push(T item) {
        storage.add(item);
    }
    public T pop(){ return storage.remove(storage.size() -1); }
}

public class GenericCast {
    public static void main(String[] args){
        FixedSizeStack<String> strings = new FixedSizeStack<>();
        for (String s: "A B C D E F G H I J".split(" "))
            strings.push(s);
        /*if(strings.getIndex() < SIZE)*/ strings.push("oops");
        int currentCount = strings.count();
        for(int i = 0; i<currentCount; i++){
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}
