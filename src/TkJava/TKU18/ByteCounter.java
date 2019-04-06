package TkJava.TKU18;

import net.mindview.util.BinaryFile;
import net.mindview.util.TextFile;

import java.rmi.server.ExportException;
import java.util.*;

import static print.Print.print;

public class ByteCounter {
    public static void main(String[] args){
        String fileName = "Ex4.java";
        // Array of all char in file:
        byte[] ca = {};
        try {
            ca = BinaryFile.read(fileName);
        }catch (Exception e){
            print("error");
        }
        // Set of unique Characters in file:
        Set<Byte> byteSet = new TreeSet<Byte>();
        for(byte c : ca) byteSet.add(c); // Autoboxing
        // List of all Characters in file:
        List<Byte> charList = new ArrayList<Byte>();
        for(byte c : ca) charList.add(c);
        Map<Byte,Integer> byteMap = new HashMap<Byte,Integer>();
        for(Byte c : byteSet) {
            int count = 0;
            for(Byte d : charList) {
                if(d.equals(c)) count++;
            }
            byteMap.put(c, count);
        }
        print();
        print(byteMap);
    }
}
