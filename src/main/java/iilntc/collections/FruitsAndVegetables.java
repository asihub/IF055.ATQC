package iilntc.collections;

public class FruitsAndVegetables {

    private int code;
    private String name;

    protected FruitsAndVegetables(int code, String name) {
        this.code = code;
        this.name = name;
    }

    protected void setCodeCode(int code) {
        this.code = code;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getCode() {
        return this.code;
    }

    protected String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

}
