package TkJava.TKU20.Test;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.util.HashMap;

public class HashMapTest9 extends HashMap<Integer,String> {
    @Test
    void _put() {
        put(1, "Hi");
        assert get(1).equals("Hi");
    }
    @Test void _containsKey() {
        put(2, "Bye");
        assert containsKey(2);
    }
    @Test void _containsValue() {
        put(3, "yes");
        assert containsValue("yes");
    }
    @Test void _get() {
        put(4, "hello");
        assert get(4).equals("hello");
    }
    @Test void _size() {
        assert size() == 0;
    }
    @Test void _clear() {
        put(5, "so long");
        clear();
        assert size() == 0;
    }
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java net.mindview.atunit.AtUnit HashMapTest9");
    }
}
