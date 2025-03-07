package exercise1;

public class HelloWorldPrinter {
    public static void main(String[] args) {

    }

    public void print(){
        System.out.println("Hello World print!");
    }
    public void printManyTimes(int times){
        for (int i = 0; i < times; i++){
            System.out.println("Hello World! " + times);
        }
    }
}
