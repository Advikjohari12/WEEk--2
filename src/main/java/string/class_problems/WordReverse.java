import java.util.Scanner;

public class WordReverse {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result = result + sb.reverse() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println(reverseEachWord(sentence));
    }
}