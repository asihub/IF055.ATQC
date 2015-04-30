public class FruitsAndVegetablesNomenclature {

    private int code;
    private String name;

    public FruitsAndVegetablesNomenclature(int code, String name){
        this.code = code;
        this.name = name;
    }

    protected void changeObjectCode(){
        this.code = code;
    }

    protected void changeObjectName(){
        this.name = name;
    }

    protected int lookForObjectCode() {
        return this.code;
    }

    protected String lookForObjectName() {
        return this.name;
    }

    @Override
    public String toString(){
        return code + " " + name;
    }
}
