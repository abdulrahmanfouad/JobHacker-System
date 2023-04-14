import java.util.*;

public class AreaOfACircle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = PI * Math.pow(radius,2);
        System.out.print("A=");
        System.out.printf("%.4f",area);
        System.out.println();
        scanner.close();
    }
}