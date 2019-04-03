package TkJava.TKU18;

import net.mindview.util.Directory;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList4 {
    public static void main(final String[] args) {
        long sum = 0;
        for(File f : Directory.walk(".","T.*\\.java")) {
            System.out.print(f + ": ");
            System.out.println(f.length());
            sum += f.length();
        }
        System.out.println("Total size: " + sum);
    }
}
