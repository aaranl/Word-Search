import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the sentence you want to input");
        String wholeString = sc.nextLine();
        wholeString.toLowerCase();
        System.out.println("What is the word you want to search for");
        String word = sc.nextLine();
        word.toLowerCase();

        System.out.println(wordSearch(wholeString, word));
    }


    public static boolean wordSearch(String wholeString, String word) {
        if (wholeString.contains(word)) {
            return true;
        }
        return false;
    }
}