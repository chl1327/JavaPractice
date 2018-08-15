package JavaAdvanced.BaseMode;

/**
 * Created by chl1327 on 2017/11/27.
 */
public class Max {
    public static <E extends Comparable<E>> E max(E o1, E o2){
        if(o1.compareTo(o2) > 0){
            return o1;
        }else {
            return o2;
        }
    }

    public static <E extends Comparable<E>> int binarySearch (E [] list,E key){
        Integer low = 0, high = list.length;
        Integer mid = (high - low)/2;
        while (!key.equals(list[mid])){
            if (key.compareTo(list[mid]) < 0) {
                high = mid;
            }else{
                low = mid;
            }
            mid = (high - low) / 2;
            if (key.equals(list[mid])) {
                return mid;
            }
        }
        return -1;
    }



}
