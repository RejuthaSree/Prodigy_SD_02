import java.util.Random;
import java.util.Scanner;

public class Prodigy_SD_02 {
    private static int randomNumber;

    public  static void main(String[]args) {
        Random random=new Random();
        randomNumber= random.nextInt(100)+1;
        System.out.println("Hello! Welcome to Guess the number game");
        System.out.println("Enter your Guess between 0 to 100");
        guessingGame(0);
    }
    static void guessingGame(int count){
        Scanner scan=new Scanner(System.in);
        int guess =scan.nextInt();
        System.out.println("Your guess is "+ guess);
        count++;

        if (randomNumber<guess) {
            System.out.println(String.format("%d is high \nTry again",guess));
            guessingGame(count);
        }
        else if (randomNumber>guess) {
            System.out.println(String.format("%d is low \nTry again",guess));
            guessingGame(count);
        }
        else{
            System.out.println("Congratulations! You won the game in "+count+" attempts");
        }
        scan.close();
    }
}
