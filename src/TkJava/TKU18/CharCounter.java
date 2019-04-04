package TkJava.TKU18;

import net.mindview.util.TextFile;

import java.util.*;

import static print.Print.print;

public class CharCounter {
    public static void main(String[] args){
        String fileName = "Ex4.java";
        // Array of all char in file:
        char[] ca = TextFile.read(fileName).toCharArray();
        // Set of unique Characters in file:
        Set<Character> charSet = new TreeSet<Character>();
        for(char c : ca) charSet.add(c); // Autoboxing
        // List of all Characters in file:
        List<Character> charList = new ArrayList<Character>();
        for(char c : ca) charList.add(c);
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(Character c : charSet) {
            int count = 0;
            for(Character d : charList) {
                if(d.equals(c)) count++;
            }
            charMap.put(c, count);
        }
        print();
        print(charMap);
    }
}
