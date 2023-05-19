import java.util.Scanner;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        char[] letters = original.toCharArray();
        StringBuilder reversed= new StringBuilder();
        for(int i = letters.length-1; i>=0; i--) {
            reversed.append(letters[i]);
        }
        System.out.println(reversed);
    }
}
