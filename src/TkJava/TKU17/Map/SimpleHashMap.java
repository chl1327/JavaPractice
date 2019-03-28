package TkJava.TKU17.Map;

import TkJava.TKU17.Map.MapEntry;
import net.mindview.util.Countries;

import java.util.*;

import static print.Print.print;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    Set<Entry<K,V>> entrySet;
    MapEntry<K,V> [] buckets = new MapEntry[SIZE];
    public V put(K key,V value){
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null){
            buckets[index] = new MapEntry<K,V>(key,value,null);
        }
        MapEntry<K,V> pair = new MapEntry<>(key,value,null);
        boolean found = false;
        int count = 0;
        while (buckets[index].hasNext()){
            count++;
            if (buckets[index].getKey().equals(key)){
                print("Key is in map" + key +" found counts: " + count);
                count = 0;
                oldValue = buckets[index].getValue();
                buckets[index].setValue(pair.getValue());
                found = true;
                break;
            }
        }
        if (!found){
            buckets[index].setNext(pair);
        }
        return oldValue;
    }
    public V get(Object key){
        int index = Math.abs(key.hashCode()) %SIZE;
        if (buckets[index] == null) {
            return null;
        }
        while (buckets[index].hasNext()){
            if(buckets[index].getKey().equals(key)){
                return buckets[index].getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> set = entrySet;
        if (set == null) {
            entrySet = new HashSet<>();
            for (int i= 0; i< buckets.length;i++) {
                if (buckets[i] == null) continue;
                MapEntry<K,V> mpair = buckets[i];
                while (mpair.hasNext()) {
                    entrySet.add(mpair);
                    mpair = mpair.getNext();
                }
            }
            return entrySet;
        }
        return set;
    }

    @Override
    public V remove(Object key) {
        Set<Entry<K,V>> set = entrySet;
        for (int i= 0; i< buckets.length;i++) {
            if (buckets[i] == null) continue;
            MapEntry<K,V> mpair = buckets[i];
            while (mpair.hasNext()) {
                if (mpair.getKey().equals(key)){
                    entrySet.remove(mpair);
                    return mpair.getValue();
                }
                mpair = mpair.getNext();
            }
        }
        return null;
    }

    @Override
    public void clear() {
        entrySet.clear();
    }

    public static void main(String[] args){
        SimpleHashMap<String,String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        print(m);
        print(m.get("ERITREA"));
        m.remove("ERITREA");
        m.clear();
        print(m.entrySet());
    }
}
