package TkJava.TKU16;

import java.util.Arrays;

public class Ex7 {
    public static ContainerComparison.BerylliumSphere[][][] sphereAM(int size1, int size2, int size3) {
        ContainerComparison.BerylliumSphere[][][] result = new ContainerComparison.BerylliumSphere[size1][size2][size3];
        for(int i = 0; i < size1; i++) {
            result[i] = new ContainerComparison.BerylliumSphere[size2][size3];
            for(int j = 0; j < size2; j++) {
                result[i][j] = new ContainerComparison.BerylliumSphere[size3];
                for(int k = 0; k < size3; k++)
                    result[i][j][k] = new ContainerComparison.BerylliumSphere();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sphereAM(2,2,2)));
        System.out.println(Arrays.deepToString(sphereAM(4,3,2)));
    }
}
