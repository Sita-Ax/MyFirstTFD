package Exercise3;

public class Exercise {
    public static void main(String[] args) {
        /*skriv ut alla tal från 1-100.
        skriv ut alla jämna tal ifrån 1-100
        skriv ut alla fibonnacci-tal ifrån 1-100
        addera de två senaste talen.
         */
        System.out.println("This is all numbers between 1-100: ");
        int number = 1;
        while (number <= 100){
            System.out.println(number + " ");
            number++;
        }

        System.out.println("Even numbers 1-100: ");
        int even = 2;
        while (even <= 100){
            System.out.println(even + " ");
            even += 2;
        }

        System.out.println();
        System.out.println("Fibonacci numbers 1-100: ");
        int first = 1;
        int second = 1;

        System.out.print(first + " ");

        while (second <= 100){
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }

    }
}
