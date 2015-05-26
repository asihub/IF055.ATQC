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

    protected int getCodeCode() {
        return this.code;
    }

    protected String getNameName() {
        return this.name;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

}
