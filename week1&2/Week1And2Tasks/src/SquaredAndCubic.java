import java.util.Scanner;

public class SquaredAndCubic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for (int i = 1; i<=limit;i++){
            int square = i*i;
            int cubic = i*i*i;
            System.out.println(i + " " + square + " " + cubic);
        }
    }
}