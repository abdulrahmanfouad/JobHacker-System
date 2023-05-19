import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int[] n = new int[100];
        int position=0;
        for(int i =0; i<100;i++){
            n[i] = scanner.nextInt();
            if(n[i]>max){
                max=n[i];
                position=i+1;

            }
        }
        System.out.println(max);
        System.out.println(position);
    }
}