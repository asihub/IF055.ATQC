package iilntc.collections;

//TODO rename
public class FruitsAndVegetablesNomenclature {

    private int code;
    private String name;

    protected FruitsAndVegetablesNomenclature(int code, String name) {
        this.code = code;
        this.name = name;
    }
    //TODO use or remove, rename to setCode()
    protected void changeObjectCode(int code) {
        this.code = code;
    }

    protected void changeObjectName(String name) {
        this.name = name;
    }

    //TODO use or remove, rename to getCode()
    protected int lookForObjectCode() {
        return this.code;
    }

    protected String lookForObjectName() {
        return this.name;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

}
