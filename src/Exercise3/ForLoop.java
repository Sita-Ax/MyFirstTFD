package Exercise3;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("This is all numbers between 1-100: ");

        for (int i = 0; i < 100; i++){
            System.out.println((i+1) + " ");
        }

        System.out.println("Even numbers 1-100: ");
        for (int i = 0; i < 100; i+=2){
            System.out.println((i+2) + " Even");
        }

        System.out.println();
        System.out.println("Fibonacci numbers 1-100: ");
        int first = 1;
        int second = 1;

        System.out.print(first + " ");

        for (int i = 0; i < 10; i++){
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }

    }
}
