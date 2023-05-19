import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char [] wordLetters = word.toCharArray();
        StringBuilder reversedWord = new StringBuilder();
        for (int k = wordLetters.length-1;k>=0;k--){
            reversedWord.append(wordLetters[k]);
        }
        String reversed = reversedWord.toString();
        if(word.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
