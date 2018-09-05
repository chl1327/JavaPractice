package TkJava.TKU5;

public class StringTest {

    private String words="123";

    private String wordsT;

    public StringTest(){
        this("123223");
    }

    public StringTest(String i){
        System.out.println(i);
        System.out.println(this.wordsT);
        this.wordsT = i;
        System.out.println(this.wordsT);
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public static void main(String[] args){
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.toString());
        StringTest stringTest1 = new StringTest("3431");
        System.out.println(stringTest1.toString());
    }

    @Override
    public String toString() {
        return "StringTest{" +
                "words='" + words + '\'' +
                ", wordsT='" + wordsT + '\'' +
                '}';
    }
}
