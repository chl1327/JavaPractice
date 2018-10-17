package TkJava.TKU6;

public class TestAuthor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestAuthor{" +
                "name='" + name + '\'' +
                '}';
    }
}
