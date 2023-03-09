package be.intecbrussel;

public class Oefening2 {
    public static void main(String[] args) {

        int leeftijd = 12;

        if (leeftijd >= 0 && leeftijd <= 20) {
            System.out.println("Uw leeftijd is: O t/m 20");
        } else if (leeftijd >= 21 && leeftijd <= 40) {
            System.out.println("Uw leeftijd is; 21 t/m 40");
        } else if (leeftijd >= 41 && leeftijd <= 60) {
            System.out.println("Uw leeftijd is 41 t/m 60");
        } else if (leeftijd >= 61 && leeftijd <= 80) {
            System.out.println("Uw leeftijd is 61 t/m 80");
        } else if (leeftijd >= 81 && leeftijd <= 100) {
            System.out.println("Uw leeftijd is 81 t/m 100");
        } else {
            System.out.println("ongeldige leeftijd");

        }
    }

}
