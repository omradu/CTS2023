package dp.factorymethod;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,8,"+");
        System.out.println(calculator.calculate());
    }
}
