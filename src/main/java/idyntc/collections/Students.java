package idyntc.collections;

/**
 * Created by Ihor Dynka on 02.05.2015.
 */
public class Students {
    private String name;
    private String surname;
    private String group;

    /**
     * constructor, that initialized the parameters of new students
     *
     * @param name    -  students name
     * @param surname - student surname
     * @param group   - student group
     */
    public Students(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    /**
     * getters and setters
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * method that helps to output more correctly
     *
     * @return correct srtring
     */
    @Override
    public String toString() {
        //TODO what's sb?
        final StringBuilder stringBuilder = new StringBuilder("Students{");
        stringBuilder.append("name='").append(name).append('\'');
        stringBuilder.append(", surname='").append(surname).append('\'');
        stringBuilder.append(", group='").append(group).append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /**
     * method equals more exactly
     *
     * @param o some object
     * @return true or false
     */


    /**
     * generate hashCode more exactly
     *
     * @return hash code of object
     */

}
