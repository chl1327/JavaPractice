package TkJava.TKU18;

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

import static print.Print.print;
import static print.Print.println;

public class Ex20 {
    public static void main(String[] args) throws IOException {
    for(File file : Directory.walk(".", ".*\\.class").files) {
        byte[] ba = BinaryFile.read(file);
        for(int i = 0; i < 4; i++)
            print(Integer.toHexString(ba[i] & 0xff).toUpperCase());
        println();
    }
}

}
