package TkJava.TKU17;

import net.mindview.util.Countries;

import java.util.*;
import java.util.regex.Pattern;

import static print.Print.println;

public class Ex2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Set set = map.keySet();
        Pattern p = Pattern.compile("A[a-zA-Z]*");
        for(int i = 0; i < Countries.DATA.length; i++) {
            if (p.matcher(Countries.DATA[i][0]).matches()){
                map.put(Countries.DATA[i][0],Countries.DATA[i][1]);
            }
        }
        println(map);
        println(set);

    }

}
