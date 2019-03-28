package TkJava.TKU17;

import net.mindview.util.Countries;

import java.util.*;

import static print.Print.print;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    Set<Map.Entry<K,V>> entrySet;
    LinkedList<MapEntry<K,V>>[] buckets = new LinkedList[SIZE];
    public V put(K key,V value){
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null){
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<>(key,value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it =bucket.listIterator();
        int count = 0;
        while (it.hasNext()){
            MapEntry<K,V> iPair = it.next();
            count++;
            if (iPair.getKey().equals(key)){
                print("Key is in map" + key +" found counts: " + count);
                count = 0;
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found){
            buckets[index].add(pair);
        }
        return oldValue;
    }
    public V get(Object key){
        int index = Math.abs(key.hashCode()) %SIZE;
        if (buckets[index] == null) {
            return null;
        }
        for (MapEntry<K,V> iPair: buckets[index]){
            if(iPair.getKey().equals(key)){
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set = entrySet;
        if (set == null) {
            entrySet = new HashSet<>();
            for (LinkedList<MapEntry<K, V>> bucket : buckets) {
                if (bucket == null) continue;
                for (MapEntry<K, V> mpair : bucket) {
                    entrySet.add(mpair);
                }
            }
            return entrySet;
        }
        return set;
    }

    @Override
    public V remove(Object key) {
        Set<Map.Entry<K,V>> set = entrySet;
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> mpair : bucket) {
                if (mpair.getKey().equals(key)){
                    entrySet.remove(mpair);
                    return mpair.getValue();
                }
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
        //m.clear();
        print(m.entrySet());
    }
}
