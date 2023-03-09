package be.intecbrussel;

public class Oefening5 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;

        }

            System.out.println("De maximale waarde is: " + max);
            System.out.println("De minimale waarde is: " + min);
        }
    }
