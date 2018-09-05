package TkJava.TKU5;

public class Doc {

    public void bark(int i,String bark){
        System.out.println("barking");
    }

    public void bark(String bark,int i){
        System.out.println("howling");
    }

    public static void main(String[] args){
        Doc doc = new Doc();
        doc.bark("",1);
        doc.bark(1,"");
    }
}
