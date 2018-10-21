package TkJava.TKU6.access.local;

/**
 * Created by chl1327 on 2018/10/21.
 */
class PackagedClass {
    public PackagedClass(){
        System.out.println("Creating a packaged class");
    }

    public static void main(String[] args){
        PackagedClass pc = new PackagedClass();
    }
}
