/**
 * Created by Ihor Dynka on 02.05.2015.
 */
public class Students {
    private String name;
    private String surname;
    private String group;

    /*
    constructor, that initialized the parameters of new students
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
     * @return
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * method equals more exactly
     *
     * @param o some object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;

        Students students = (Students) o;

        if (!group.equals(students.group)) return false;
        if (!name.equals(students.name)) return false;
        if (!surname.equals(students.surname)) return false;

        return true;
    }

    /**
     * generate hashCode more exactly
     *
     * @return hash code of object
     */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }
}
