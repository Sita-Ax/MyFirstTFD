package JavaUtility;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int[] fibonacci = new int[10];
        ArrayList<Integer> fibonacciA = new ArrayList<Integer>();

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        //System.out.println(fibonacci[number-1]);

        fibonacciA.add(1);
        fibonacciA.add(1);
        for (int i = 2; i < number; i++){
            fibonacciA.add(fibonacciA.get(i-1) + fibonacciA.get(i-2));
        }
        //System.out.println(fibonacciA.get(number-1));


    }
}
