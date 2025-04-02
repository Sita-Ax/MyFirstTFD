package Exercise2;

public class ConditionCoverage {
    public static void main(String[] args) {
        testConditionCoverage(5);
        testConditionCoverage(4);
        testConditionCoverage(-3);
        testConditionCoverage(0);

    }

    private static void testConditionCoverage(int result) {
        if(result > 0 && result % 2 == 0){
            print("Even number", result);
        } else if (result > 0 && result % 2 != 0) {
            print("Odd number", result);
        } else {
            print("Negative or zero", result);
        }
    }
    private static void print(String message, int number) {
        System.out.println(message + ": " + number);
    }
}
