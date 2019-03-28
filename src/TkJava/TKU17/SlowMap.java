package TkJava.TKU17;

import net.mindview.util.Countries;

import java.util.*;

import static print.Print.print;

public class SlowMap<K,V> extends AbstractMap<K,V>{
    Set<Map.Entry<K,V>> entrySet;
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    public V put(K key, V value){
        V oldValue = get(key);
        if (!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else {
            values.set(keys.indexOf(key),value);
        }
        return oldValue;
    }
    public V get(Object key){
        if (!keys.contains(key)){
            return null;
        }
        return values.get(keys.indexOf(key));
    }
    public Set<Entry<K,V>> entrySet() {
        Set<Map.Entry<K, V>> set = entrySet;
        if (set == null) {
            entrySet = new HashSet<>();
            Iterator<K> ki = keys.iterator();
            Iterator<V> vi = values.iterator();
            while (ki.hasNext()) {
                entrySet.add(new MapEntry<K, V>(ki.next(), vi.next()));
            }
            return entrySet;
        } else {
            return set;
        }
    }

    public static void main(String[] args){
        SlowMap<String,String> m = new SlowMap<>();
        m.putAll(Countries.capitals(15));
        print(m);
        print(m.get("BULGARIA"));
        print(m.entrySet());
    }
}
