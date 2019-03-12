package TkJava.TKU16;

import java.util.Arrays;

public class Ex6 {
    public static ContainerComparison.BerylliumSphere[][] sphereAM(int size1, int size2) {
        ContainerComparison.BerylliumSphere[][] result = new ContainerComparison.BerylliumSphere[size1][size2];
        for(int i = 0; i < size1; i++) {
            result[i] = new ContainerComparison.BerylliumSphere[size2];
            for(int j = 0; j < size2; j++)
                result[i][j] = new ContainerComparison.BerylliumSphere();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sphereAM(2,2)));
        System.out.println(Arrays.deepToString(sphereAM(4,3)));
    }
}
