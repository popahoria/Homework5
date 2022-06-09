import java.util.Scanner;

public class Exercises {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //coutCharacter(scanner);
        //redactString(scanner);
        findInArray(scanner);

    }

    public static void coutCharacter(Scanner scanner) {

        System.out.println("Enter String");
        String inputString = scanner.nextLine();
        System.out.println("Enter character");
        String character = scanner.nextLine();
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = inputString.indexOf(character, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += character.length();
            }
        }
        System.out.println(count);
    }

    public static void redactString(Scanner scanner) {
        System.out.println();
        System.out.println("====================================================================");
        System.out.println("Enter a string");
        String word = scanner.nextLine();
        System.out.println();
        String redactedWord = "*".repeat(word.length());
        System.out.println("Redacted word id: " + redactedWord);

    }

    public static void findInArray(Scanner scanner) {
        System.out.println();
        System.out.println("====================================================================");
        System.out.println("Enter words separated by space: ");
        String[] words = scanner.nextLine().split(" ");
        System.out.println("Enter word to search: ");
        String wordToSearch = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == wordToSearch) { // ????????????????????????????????????
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }
}

