package excersice1;

public class Excersice {
    public static void main(String[] args) {
    /*skapa ett program som använder tre tal, programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.*/
    int one = 2;
    int two = 5;
    int three = 9;

    int sum = one + two + three;
    int median = sum / 3;

    System.out.println("Sum is: " + sum);
    System.out.println("The Median is: " + median);



    /*skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel Rektangelns sidor ska läsas in..*/


        int height = 6;
        int lenght = 8;
        int area = height * lenght;
        int circ = height * 2 + lenght + 2;

        System.out.println();
        System.out.println("The area is: " + area);
        System.out.println("The circ is: " + circ);


    }
}
