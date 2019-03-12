package TkJava.TKU16;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
    public static void main(String[] args){
        List<List<String>> ls = new ArrayList<>();
        List<String> la = new ArrayList<>();
        ls.add(new ArrayList<String>());
        List<Object> lo = new ArrayList<Object>();
        // lo = lls; // error: incompatible types
        // Compile-time warning eliminated:
        List<List<ContainerComparison.BerylliumSphere>> llb =
                new ArrayList<List<ContainerComparison.BerylliumSphere>>();
        for(int i = 0; i < 10; i++) {
            llb.add(new ArrayList<ContainerComparison.BerylliumSphere>());
            for(int j = 0; j < 2; j++)
                llb.get(i).add(new ContainerComparison.BerylliumSphere());
        }
        System.out.println(llb);
    }
}
