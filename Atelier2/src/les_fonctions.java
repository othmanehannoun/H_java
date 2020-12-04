import java.util.Scanner;

public class les_fonctions {

    public static void main(String[] args) {

        String firstName, lastName, s;
        int age;

        Scanner reader = new Scanner(System.in);

        System.out.println("Exercice 1: ");
        System.out.println("Enter votre prénom svp: ");
        firstName = reader.next();
        System.out.println("Enter votre nom svp: ");
        lastName = reader.next();
        System.out.println("Enter votre age svp: ");
        age = reader.nextInt();


        afficher(firstName, lastName, age);

        System.out.println("\n ######################################### \n \n exercice 2:");

        System.out.println("Enter votre sexe svp: ");
        s = reader.next();
        System.out.println("Enter votre age svp: ");
        age = reader.nextInt();

        info(s, age);

        reader.close();

    }

    public static void afficher(String firstName, String lastName, int age) {

        System.out.println("Bonjour " + firstName + " " + lastName + " votre age est " + age + " ans");

    };

    public static void info(String s, int age) {

        if (age >= 18) {

            System.out.println("Vous êtes " + s + " et vous êtes majeur");

        } else {

            System.out.println("Vous êtes " + s + " et vous êtes mineur");

        }

    }

}
