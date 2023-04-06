import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        int numberOfHundreds=number/100;
        number=number%100;
        System.out.println(numberOfHundreds+" nota(s) de R$ 100,00");
        int numberOfFifties=number/50;
        number=number%50;
        System.out.println(numberOfFifties+" nota(s) de R$ 50,00");
        int numberOfTwenties=number/20;
        number=number%20;
        System.out.println(numberOfTwenties+" nota(s) de R$ 20,00");
        int numberOfTens=number/10;
        number=number%10;
        System.out.println(numberOfTens+" nota(s) de R$ 10,00");
        int numberOfFives=number/5;
        number=number%5;
        System.out.println(numberOfFives+" nota(s) de R$ 5,00");
        int numberOfTwos=number/2;
        number=number%2;
        System.out.println(numberOfTwos+" nota(s) de R$ 2,00");
        int numberOfOnes=number/1;
        System.out.println(numberOfOnes+" nota(s) de R$ 1,00");

        scanner.close();
    }
}
