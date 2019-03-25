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

            names[i] = scanner.nextLine();
        }




    }

}
