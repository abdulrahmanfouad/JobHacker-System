import java.util.Scanner;

public class EvenOddPositiveNegative{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenNumber = 0;
        int oddNumber = 0;
        int positiveNumber = 0;
        int negativeNumber = 0;
        int [] numbers = new int[5];
        for (int i = 0; i<5; i++ ){
            numbers[i]= scanner.nextInt();
            if (numbers[i]%2==0){
                evenNumber++;
            } else {
                oddNumber++;
            }
            if(numbers[i]>0){
                positiveNumber++;
            } else if(numbers[i]<0){
                negativeNumber++;
            }
        }
        System.out.println(evenNumber+" even number(s)");
        System.out.println(oddNumber+ " odd number(s)");
        System.out.println(positiveNumber+ " positive number(s)");
        System.out.println(negativeNumber+ " negative number(s)");
    }
}