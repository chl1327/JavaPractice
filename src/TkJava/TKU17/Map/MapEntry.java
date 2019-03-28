package TkJava.TKU17.Map;

import java.util.Map;

public class MapEntry<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;
    private MapEntry<K,V> next = null;
    public MapEntry(K key, V value, MapEntry<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
    public V setValue(V v){
        V result = value;
        value = v;
        return result;
    }
    public int hashCode(){
        return (key == null? 0: key.hashCode())^(value == null? 0: value.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)){
            return false;
        }
        MapEntry me = (MapEntry)obj;
        return (key == null ? me.getKey() == null: key.equals(me.getKey())) &&
                (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }

    public MapEntry<K, V> getNext() {
        return next;
    }

    public boolean hasNext(){
        if (next == null){
            return false;
        }else {
            return true;
        }
    }

    public void setNext(MapEntry<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
