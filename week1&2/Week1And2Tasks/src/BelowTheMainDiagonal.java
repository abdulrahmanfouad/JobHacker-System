import java.util.Scanner;

public class BelowTheMainDiagonal{
    public static void main(String[] args) {
        double[][] array = new double[12][12];
        double sum=0.0;
        double average;
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        for(int i =0;i<12;i++){
            for(int j =0;j<12;j++){
                array[i][j]=scanner.nextDouble();
                if(i>j){
                    sum+= array[i][j];
                }
            }
        }


        if("S".equals(choice)){
            System.out.printf("%.1f",sum);
            System.out.println();
        } else if ("M".equals(choice)){
            average=sum/66.00;
            System.out.printf("%.1f",average);
            System.out.println();
        }
    }
}