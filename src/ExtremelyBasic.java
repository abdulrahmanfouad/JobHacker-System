import java.util.Scanner;
//*
public class ExtremelyBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("X = "+sum);
        scanner.close();
    }
}