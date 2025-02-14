public class Operations {
    public static void main(String[] args) {
        /*
        + plus
        - minus
        * gånger
        / delat med
        % modulus (rest av division)

        7 % 3 = 1
        7 / 3 = 2 + resten 1
        25 % 5 = 0
        137 % 10 = 7
        */

        int number = 5;
        int nextNumber = 6;
        int third = 137 % 10;

        number = nextNumber * 3 + 2;
        nextNumber = number / 7;

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println(third);
    }
}
