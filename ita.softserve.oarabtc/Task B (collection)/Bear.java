/**
 * Created by Olia on 03.05.2015.
 */


public class Bear {
    private String name;
    private int size;

    public String getName() {
        return name;    }
    public void setName(String name) {
        this.name = name;    }

    public int getSize() {
        return size;    }
    public void setSize(int size) {
        this.size = size;    }

    public Bear(String name, int size) {
        this.name = name;
        this.size = size;    }

    @Override
    public String toString() {
        return "Bear " + name +
                ", size " + size;
    }
}
