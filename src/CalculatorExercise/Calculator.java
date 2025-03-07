package CalculatorExercise;

public class Calculator {
    private final double numberOne;
    private final double numberTwo;
    public  Calculator(double numberOne, double numberTwo){

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }



    public double add(){
        return numberOne + numberTwo;
    }
    public double sub(){
        return numberOne - numberTwo;    }
    public double multi(){
        return numberOne * numberTwo;    }
    public double divide(){
        return numberOne / numberTwo;    }
}
