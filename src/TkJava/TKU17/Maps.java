package TkJava.TKU17;

import net.mindview.util.CountingMapData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static print.Print.print;
import static print.Print.printnb;

public class Maps {
    public static void printKeys(Map<Object,Object> map){
        printnb("Size = " + map.size() + " ,");
        printnb("Keys: ");
        print(map.keySet());
    }

    public static void test(Map<Object,Object> map){
        print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        printKeys(map);
        map.putAll(new CountingMapData(10));
        printKeys(map);
        printnb("Values: ");
        print(map.values());
        print(map);
        print("map.containsKey(11): "+ map.containsKey(11));
        print("map.get(11): "+ map.get(11));
        print("map.containsValue(\"F0\"): "+ map.containsValue("F0"));
        Object key = map.keySet().iterator().next();
        print("First key in map: "+ key);
        map.remove(key);
        printKeys(map);
        map.clear();
        print("map.isEmpty(): "+map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        print("map.isEmpty(): "+ map.isEmpty());
    }
    public static void main(String[] args){
        /*test(new HashMap<>());
        test(new TreeMap<>());
        test(new LinkedHashMap<>());
        test(new IdentityHashMap<>());
        test(new ConcurrentHashMap<>());
        test(new WeakHashMap<>());*/
        /*Map map = new Properties();
        test(map);*/
        test(new SimpleHashMap<>());
    }
}
