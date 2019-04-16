package TkJava.TKU20.Test;

import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.util.HashSet;

public class HashSetTest5 extends HashSet<String> { // now it is a HashSet<Sting>
    @Test
    void initialization() {
        assert this.isEmpty();
    }
    @Test void _contains() {
        this.add("one");
        assert this.contains("one");
    }
    @Test void _remove() {
        this.add("one");
        this.remove("one");
        assert this.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java net.mindview.atunit.AtUnit HashSetTest5");
    }
}
