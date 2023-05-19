import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean isValid;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.contains("()") || input.contains("[]") || input.contains("{}")) {
            input = input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        isValid=input.length() == 0;
        System.out.println(isValid);
    }
}
