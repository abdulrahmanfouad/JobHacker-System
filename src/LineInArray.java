import java.util.Scanner;

public class LineInArray{
    public static void main(String[] args) {
        double[][] array = new double[12][12];
        Scanner scanner = new Scanner(System.in);
        int lineNumber = scanner.nextInt();
        String choice = scanner.next();
        System.out.println(choice);
            for(int i =0;i<3;i++){
                for(int j =0;j<3;j++){
                    array[i][j]=scanner.nextDouble();
                }
            }
        
        double sum=0.0;
        double average=0.0;
        if("S".equals(choice)){
            for(int j=0;j<3;j++){
            sum+= array[lineNumber][j];
            }
            System.out.printf("%.1f",sum);
            System.out.println();
        } else if ("M".equals(choice)){
            for(int j=0;j<3;j++){
                sum+= array[lineNumber][j];
                }
                average=sum/12.00;
                System.out.printf("%.1f",average);
                System.out.println();
        }
    }
}