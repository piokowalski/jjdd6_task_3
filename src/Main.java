import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int howManyNames;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many names below:");
        howManyNames = scanner.nextInt();

        String[] names = new String[howManyNames];

        for (int i = 0; i < howManyNames; i++) {
            System.out.println("Enter the name below: ");
            scanner = new Scanner(System.in);
            // scanner needs to be repeated (scanners issue)
            names[i] = scanner.nextLine();
        }

        String longest = names[0];
        for (int i=0; i <howManyNames; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        System.out.println("The longest name is :" + longest);


        String shortest = names[0];
        for (int i=0; i <howManyNames; i++) {
            if (names[i].length() < shortest.length()) {
                shortest = names[i];
            }
        }
        System.out.println("The shortest name is: " + shortest);





        /**
         * longest = names[0]
         * for (0....howManyNames) {
         *   if (names[i].length() > longest) {
         *     longest = names[i]
         *   }
         * }
         *
         * ->>> max to longest
         */
    }
}