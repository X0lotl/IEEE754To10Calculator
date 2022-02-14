import java.util.Scanner;

public class Calculator {
    private int sign;
    private int exponent;
    private int fraction;

    public void readInputData(String inputData){
        Scanner scanner = new Scanner(inputData);
        sign = Integer.parseInt(scanner.next());
        exponent = Integer.parseInt(scanner.next());
        fraction = Integer.parseInt(scanner.next());
    }
}
