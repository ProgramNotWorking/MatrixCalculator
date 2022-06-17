package Calculation;

public class CalculatorThings {

    String expression;
    String[] stringArray;
    double firstNumber;
    String sign;
    double secondNumber;

    public CalculatorThings(String expression) { this.expression = expression; }

    public void setStringArray() { this.stringArray = expression.split(" "); }

    public String getStringArray(int n) { return this.stringArray[n]; }

    public double getFirstNumber() { return Double.parseDouble(getStringArray(0)); }

    public String getSign() { return getStringArray(1).trim(); }

    public double getSecondNumber() { return Double.parseDouble(getStringArray(2)); }

    public double calculationProcess() {

        switch (getSign()) {
            case "+":
                return getFirstNumber() + getSecondNumber();
            case "-":
                return getFirstNumber() - getSecondNumber();
            case "*":
                return getFirstNumber() * getSecondNumber();
            case "/":
                try {
                    return getFirstNumber() / getSecondNumber();
                } catch (ArithmeticException exception) {
                    System.out.println("Divine by zero");
                    exception.fillInStackTrace();
                }
                break;
        }

        return 0;

    }

}
