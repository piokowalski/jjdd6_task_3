import java.util.Random;
import java.util.Scanner;

//pobrac numer z klawiatury, porownac z wygenerowana
//wypisac jaka liczbe szukano i po ilu probach

public class Task2 {

    public static void main(String[] args) {

        int digit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one digit below:");
        digit = scanner.nextInt();


        int c = 0;


        Random toCompare = new Random();
        int counter = 0;
        while(digit != c) {
            c = toCompare.nextInt(100);
            counter++;
        }
        System.out.println("We're looking for number: "+digit);

        System.out.println("The number has been found after: "+counter);


        }
        public static double randomNumber(double x) {
        x = Math.random();
        return x;
        }

    }

