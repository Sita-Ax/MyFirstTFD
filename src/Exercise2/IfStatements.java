package Exercise2;

public class IfStatements {
    public static void main(String[] args) {
        int one = 1;
        int two = 1;

        if (one > two){
            System.out.println("Number 1 is larger than number 2 ");
        } else if(one == two) {
            System.out.println("Same number.");
        }
        else {
            System.out.println("one is smaller than two. ");
        }
        System.out.println(" End of text!");
    }
}
