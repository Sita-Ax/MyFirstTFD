package SpellExercise;

import java.util.Random;
import java.util.Scanner;

public class Words {
    private String[] words = {"game", "computer", "programming"};
    int score = 0;
    private Random random = new Random();

    public void StartSpelling(Scanner scanner){
        for (int i = 0; i < 3; i++) {
            String word = words[random.nextInt(words.length)]; // Välj ett slumpmässigt ord
            System.out.println("Type this word: " + word);
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase(word)) { // Jämför utan att bry sig om stora/små bokstäver
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct spelling is: " + word);
            }
        }
    }
    public int getScore(){
        return score;
    }
}
