package be.intecbrussel;

public class Oefening4 {
    public static void main(String[] args) {

        char cho = 'B';


        if (cho >= 'a' && cho <= 'z') {
            System.out.println("is a lowercase letter");
        } else if (cho >= 'A' && cho <= 'Z') {
            System.out.println("is an Uppercase Letter");
        } else if (cho >= '0' && cho <= '9') {
            System.out.println("is a digital number");
        } else {
            System.out.println("is not a upper or lowercase letter or digital number");
        }



        }
    }
