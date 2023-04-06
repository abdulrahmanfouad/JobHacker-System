import java.io.IOException;
import java.util.*;

public class ExtremelyBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("X = "+sum);
    }
}