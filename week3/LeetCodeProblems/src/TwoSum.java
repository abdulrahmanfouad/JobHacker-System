import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length higher than zero");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i<length; i++){
            nums[i]= scanner.nextInt();
        }
        System.out.println("Enter Target");
        int target = scanner.nextInt();
        for (int i = 0;i<length;i++){
            for (int j =1; j<length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+","+j+"]");
                    System.exit(0);
                }

            }
        }
    }
}
