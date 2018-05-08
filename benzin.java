//Benzin
package benzinverbrauch;

import java.util.Scanner;

public class BenzinVerbrauch {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib das verbrauchte Benzin in Liter ein:");
        int benzin = eingabe.nextInt();

        System.out.println("Bitte gib die verfahrenen Kilometer ein:");
        int kilometer = eingabe.nextInt();

        int durchschnittsbenzin = (benzin * 100) / kilometer;
        System.out.println("Der durchschnittliche Benzinverbrauch ist: " + durchschnittsbenzin + " Liter.");
    }
}

