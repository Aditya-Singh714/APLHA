import java.util.Scanner;

public class Strings {
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String agrs[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";  // method 1
        String str2 = new String("I am IronMan"); // method 2

        // In java Strings are immutable: string cannot change 

        Scanner sc = new Scanner(System.in);

        String name;
        // name = sc.next(); // takes always one word
        // name = sc.nextLine(); // takes whole senetence or a word
        // System.out.println(name);

        System.out.println(str2.length()); // calculate length of string

        // concatination: str1 + str2
        String firstName = "Aaditya";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // charAt: find the index of a character of String
        System.out.println(fullName.charAt(2));
        printLetters(fullName);
    }
}