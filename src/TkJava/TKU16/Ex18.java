package TkJava.TKU16;

import net.mindview.util.Generated;

import java.util.Arrays;

public class Ex18 {
    public static void main (String[] args){
        ContainerComparison.BerylliumSphere[]  spheres = new ContainerComparison.BerylliumSphere[5];
        spheres = Generated.array(spheres, new ContainerComparison.BerylliumSphere());
        ContainerComparison.BerylliumSphere[] spheres1 = new ContainerComparison.BerylliumSphere[5];
        System.arraycopy(spheres, 0, spheres1, 0, spheres.length);
        spheres[0] = new ContainerComparison.BerylliumSphere();
        System.out.println(Arrays.deepToString(spheres));
        System.out.println(Arrays.deepToString(spheres1));
    }
}
