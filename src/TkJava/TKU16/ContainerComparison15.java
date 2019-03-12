package TkJava.TKU16;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

class BerylliumSphereGenerator implements Generator<ContainerComparison.BerylliumSphere> {
    public ContainerComparison.BerylliumSphere next() {
        return new ContainerComparison.BerylliumSphere();
    }
}

public class ContainerComparison15 {
    public static void main(String[] args) {
        ContainerComparison.BerylliumSphere[] spheres = new ContainerComparison.BerylliumSphere[5];
        BerylliumSphereGenerator bsg = new BerylliumSphereGenerator();
        Generated.array(spheres, bsg);

        print(Arrays.toString(spheres));
        print(spheres[4]);
        List<ContainerComparison.BerylliumSphere> sphereList =
                new ArrayList<ContainerComparison.BerylliumSphere>();
        for(int i = 0; i < 5; i++)
            sphereList.add(bsg.next());
        print(sphereList);
        print(sphereList.get(4));
    }
}