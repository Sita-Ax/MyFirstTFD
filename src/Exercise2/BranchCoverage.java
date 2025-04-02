package Exercise2;

public class BranchCoverage {
    public static void main(String[] args) {

            int result = 8;
            if (result > 0)
                if (result % 2 == 0)
                    print("Even number", result);
                else
                    print("Odd number", result);
            else
                print("Negative", result);


    }

    private static void print(String evenNumber, int result) {
        System.out.println(evenNumber + ": " + result);
    }
}
