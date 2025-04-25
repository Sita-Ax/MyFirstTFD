import exercise1.HelloWorldPrinter;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        System.out.println(" Hello Dog!");
        System.out.println("Du skrev: " +text);

        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number);
        System.out.println(text);

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        hwp.printManyTimes(11);
        hwp.print();
        /*
        String text = "hej";
        System.out.println(text + "då");
        text = text + " då";
        System.out.println(text);
         */
        /*
        System.out.println("Hello World");
        System.out.print("Without ln " + "mer text" + " ");
        System.out.println("Hello again!!");
        */
    }
}
