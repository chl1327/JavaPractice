package TkJava.TKU5;

public class Tank {

    Boolean isFull = false;

    public Tank(Boolean isFull){
        this.isFull = isFull;
    }

    protected void finalize(){
        if (isFull){
            System.out.println("Error");
        }
    }

    public static void main(String[] args){
        Tank tank = new Tank(true);
        tank.finalize();
    }
}
