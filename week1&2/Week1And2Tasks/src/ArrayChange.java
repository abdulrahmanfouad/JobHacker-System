import java.util.Scanner;

public class ArrayChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[20];
        for (int i = 0; i<20;i++){
            array[i]= scanner.nextInt();
        }
        for (int k=0; k<20; k++){
            System.out.println("N["+ (k) +"]="+array[array.length-1-k]);
        }
    }
}