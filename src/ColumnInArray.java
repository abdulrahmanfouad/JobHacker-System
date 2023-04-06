import java.util.Scanner;

public class ColumnInArray{
    public static void main(String[] args) {
        double[][] array = new double[12][12];
        Scanner scanner = new Scanner(System.in);
        int columnNumber = scanner.nextInt();
        String choice = scanner.next();
            for(int i =0;i<12;i++){
                for(int j =0;j<12;j++){
                    array[i][j]=scanner.nextDouble();
                }
            }
        
        double sum=0.0;
        double average=0.0;
        if("S".equals(choice)){
            for(int j=0;j<12;j++){
            sum+= array[j][columnNumber];
            }
            System.out.printf("%.1f",sum);
            System.out.println();
        } else if ("M".equals(choice)){
            for(int j=0;j<12;j++){
                sum+= array[j][columnNumber];
                }
                average=sum/12.00;
                System.out.printf("%.1f",average);
                System.out.println();
        }
    }
}