package TkJava.TKU17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static print.Print.print;

public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;
    private char c;
    public CountedString(String str, char ch){
        s = str;
        c = ch;
        created.add(s);
        for (String s2: created){
            if(s2.equals(s)){
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: "+ s +"Char " + c +" id: "+ id +
                " hashCode(): " + hashCode();
    }

    public int hashCode(){
        int result = 17;
        result = 37* result + s.hashCode();
        result = 37* result + c;
        //result = 37*result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CountedString && s.equals(((CountedString)obj).s)
                && c == (((CountedString)obj).c) && id == ((CountedString)obj).id;
    }

    public static void main(String[] args){
        Map<CountedString,Integer> map =new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for(int i = 0; i<cs.length; i++){
            cs[i] = new CountedString("hi",'a');
            map.put(cs[i],i);
        }
        print(map);
        for(CountedString cstring: cs){
            print("Looking up " + cstring);
            print(map.get(cstring));
        }
    }
}
