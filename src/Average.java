import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        double average = (firstNumber*0.2) + (secondNumber*0.3) + (thirdNumber*0.5);
        System.out.print("MEDIA = ");
        System.out.printf("%.1f",average);
        System.out.println();
        scanner.close();
    }
}