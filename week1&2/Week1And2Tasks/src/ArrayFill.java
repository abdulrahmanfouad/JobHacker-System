import java.util.Scanner;

public class ArrayFill{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limitNumber = scanner.nextInt();
        int iterationNumber=0;
        for(int i =0;i<1000;i++){
            System.out.println("N["+i+"] = "+iterationNumber);
            iterationNumber++;
            if(iterationNumber==limitNumber)
                iterationNumber=0;
        }
    }
}