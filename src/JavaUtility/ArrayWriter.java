package JavaUtility;

import java.util.Scanner;

public class ArrayWriter {
    public static void main(String[] args) {
        //läs in 5 namn från terminalen
        Scanner scan = new Scanner(System.in);

        //spara i en array som är 5 lång i text
        String[] names = new String[5];

        for(int i = 0; i < names.length; i++){
            names[i] = scan.nextLine();
        }

        //skriv ut första och sista namnet.
        System.out.println(names[0]);
        System.out.println(names[4]);
        //nata
        //mette
        //ola
        //gunnar
        //adam
        //nata
        //adam
    }
}
