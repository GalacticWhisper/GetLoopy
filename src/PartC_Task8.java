import java.util.Scanner;
import java.util.Random;
public class PartC_Task8 {
    public static void main(String[] args) {

        Random generator = new Random();
        int die1 = 1;
        int die2 = 2;
        int die3 = 3;
        int rollNumber = 0;
        int rollSum = die1 + die2 + die3;
        String YN;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Roll:       Die1 Die2 Die3 DieSum");
        System.out.println("_________________________________");

        do {

            while (die1!=die2 && die3!=die1) {
                rollNumber++;
                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;
                die3 = generator.nextInt(6) + 1;
                rollSum = die1 + die2 + die3;

                System.out.printf("Roll: %-5d %4d %4d %4d %6d\n", rollNumber, die1, die2, die3, rollSum);

            }
            System.out.print("Roll dice again? [Y/N]: ");
            YN = in.nextLine();
            switch (YN) {
                case "Y":
                case "y":
                    die1 = 1;
                    die2 = 2;
                    die3 = 3;
                    rollNumber = 0;
                    break;
                case "N":
                case "n":
                    done = true;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    done = true;
                    System.out.println("Thanks for playing!");
            }
        } while(!done);
    }
}