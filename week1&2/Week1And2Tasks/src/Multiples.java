import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if(firstNumber>secondNumber){
            if(firstNumber%secondNumber==0){
                System.out.println("Sao Multiplos");
            } else {
                System.out.println( "Nao sao Multiplos");
            }
        } else if(secondNumber>firstNumber){
            if(secondNumber%firstNumber==0){
                System.out.println("Sao Multiplos");
            } else{
                System.out.println( "Nao sao Multiplos");
            }
        } else{
            System.out.println("Sao Multiplos");
        }
        scanner.close();
    }
}