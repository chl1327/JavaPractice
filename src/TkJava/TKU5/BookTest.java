package TkJava.TKU5;

public class BookTest {

    private String info;

    Boolean checkOut = false;

    public BookTest(Boolean checkOut){
        this.checkOut =checkOut;
    }

    public void checkIn(){
        checkOut = false;
        this.finalize();
    }

    protected void finalize(){
        if(checkOut){
            System.out.println("Error");
        }else {
            System.out.println("Success");
        }
    }

    public static void main(String[] args){
        BookTest novel = new BookTest(true);
        novel.checkIn();
        //new BookTest(true);
        //System.gc();

    }
}
