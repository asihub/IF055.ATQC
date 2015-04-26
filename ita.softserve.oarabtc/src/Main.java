/**
 * Created by Olia on 26.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        fixedPayEm A1 = new fixedPayEm (1, "Bilbo", "Beggins", 500);
        fixedPayEm B1 = new fixedPayEm (2, "Oleg", "Nadraga", 850);

        hourlyPayEm A2 = new hourlyPayEm(99, "Anakin", "Skywalker", 3.1);
        hourlyPayEm B2 = new hourlyPayEm(98, "QuiGon", "Jinn", 4.1);
        hourlyPayEm C2 = new hourlyPayEm(97, "Padme", "Amidala", 7.0);
    }

}
