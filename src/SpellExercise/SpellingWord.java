package SpellExercise;

import java.util.Scanner;

public class SpellingWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Words words = new Words();

        System.out.println("Welcome to my spelling game!");
        words.StartSpelling(scanner);

        System.out.println("\nGame over! Your total score: " + words.getScore());
        scanner.close();
    }
}
