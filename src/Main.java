import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your data: ");
        String inputString = scanner.nextLine();
        calculate.readInputData(inputString);
    }
}
