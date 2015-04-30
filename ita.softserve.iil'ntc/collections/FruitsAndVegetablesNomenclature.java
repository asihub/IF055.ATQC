public class FruitsAndVegetablesNomenclature {

    private int code;
    private String name;

    public FruitsAndVegetablesNomenclature(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int lookForObjectCode() {
        return this.code;
    }

    public String lookForObjectName() {
        return this.name;
    }

    @Override
    public String toString(){
        return code + " " + name;
    }
}
