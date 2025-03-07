package Exercise2;

public class Exercise {
    public static void main(String[] args) {

        /*Jämför två tal. om det första är större än det andra skriv ut "Första talet är störst", samt "Andra talet är störst" om det är tvärtom*/
        int one = 12;
        int two = 8;
        if(one < two){
            System.out.println("The first number is larger than second number.");
        } else {
            System.out.println("The second number is larger than the first number.");
        }
        /*Jämför två tal. Om det första är jämt delbart med det andra skriv ut "Jämt delbart", annars skriv ut "Inte jämt delbart"*/
        if(one%two == 0){
            System.out.println("equally divisible");
        } else {
            System.out.println("not equally divisible");
        }
    }
}
