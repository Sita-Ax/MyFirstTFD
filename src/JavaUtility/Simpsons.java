package JavaUtility;

import java.util.HashMap;
import java.util.Scanner;

public class Simpsons {
    public static void main(String[] args) {
        HashMap<String, String> simpsons = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        simpsons.put("Homer", "D oh!");
        simpsons.put("Marge", "Mmm-mmmmm");
        simpsons.put("Bart", "Ay, caramba!");
        simpsons.put("Lisa", "If anyone wwants me, I´ll be in my room.");
        simpsons.put("Maggie", "Pacifier Suck");
        simpsons.put("Ned", "Hi-Diddily-Ho!");
        simpsons.put("Burns", "Excellent!");
        simpsons.put("Chalmers", "Ha!");
        simpsons.put("Edna", "Thank you, Come again!");
        simpsons.put("Stu", "Disco Stu like disco music.");

        for (int i = 0; i < 5; i++) {
            String name = scan.nextLine();
            System.out.println(simpsons.get(name));
        }


    }
}
