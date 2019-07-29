package TkJava;

public final class inte {

    public static int getI(int i){
        try{
            ++i;
            return i++;
        }finally {
            i++;
        }
    }

    public static int getI2(int i){
        try{
            ++i;
        }finally {
            return i++;
        }
    }
    public static void main(String[] args){
        System.out.println(inte.getI(5));
        System.out.println(inte.getI2(5));
    }

}
