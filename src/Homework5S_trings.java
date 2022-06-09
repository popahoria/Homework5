import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Homework5S_trings {


    public class homework5 {

        public static void main(String[] args) {
            System.out.println("=============== ====================================================");
            String[] names = {"Alina", "Alex", "Marius", "Razvan", "Alexandra", "Andrei", "Claudiu", "David", "Mihai", "Aurel"};
            System.out.println("Your names from array are:" +
                    " Alina, Alex, Marius, Razvan, Alexandra, Andrei, Claudiu, David, Mihai, Aurel");

            printLeeterA(names);
            printNamesContainingGivenString(names);
            replaceLetterR(names);
            printFirst3Char(names);
            printRandomCharacter(names);
            abbreviateMiddleName();
        }

        public static void printLeeterA(String[] names) {
            System.out.println("Print all names starting with 'A' :");
            for (int i = 0; i < names.length; i++) {
                if (names[i].charAt(0) == 'A') {
                    System.out.println(names[i]);
                }
            }
            System.out.println();
        }

        public static void printNamesContainingGivenString(String[] names) {
            System.out.println("====================================================================");
            System.out.println("Enter a String to check if any name contains that String:");
            Scanner scanner = new Scanner(System.in);
            String givenSubstring = scanner.nextLine();
            for (int i = 0; i < names.length; i++) {
                if (names[i].toLowerCase().contains(givenSubstring.toLowerCase())) {
                    names[i].contains(givenSubstring);
                    System.out.println(names[i]);
                }
            }
        }

        public static void replaceLetterR(String[] names) {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("Replace 'r' with '*'");
            for (int i = 0; i < names.length; i++) {
                names[i] = names[i].replace("r", "*");
                System.out.println(names[i]);
                names[i] = names[i].replace("*", "r");
            }
        }

        private static void printFirst3Char(String[] names) {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("Print the first 3 character of each string");
            for (int i = 0; i < names.length; i++) {
                if (names[i].length() > 2) {
                    System.out.println(names[i].substring(0, 3));
                } else {
                    System.out.println("the string has no more then 3 characters");
                }
            }
        }

        public static void printRandomCharacter(String[] names) {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("Print a random character");
            String result = String.join("", names);
            Random random = new Random();
            int randomInt = random.nextInt(result.length());
            char randomChar = result.charAt(randomInt);

            System.out.println("Random character from string: " + randomChar);

        }

        public static void abbreviateMiddleName() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            String[] names = name.split(" ");
            if (names.length < 3 || names[2].length() == 1) {
                System.out.println("Your name can not be abbrev: " + name);
            } else {
                names[0] = names[0].toUpperCase();
                names[1] = names[1].toUpperCase().charAt(0) + ".";
                names[2] = names[2].toUpperCase();
                System.out.print(String.join(" ", names));
            }
        }
    }
}
