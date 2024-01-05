import java.util.Random;
import java.util.Scanner;
/*
  Author -: Thusith Wickramasinghe
  CodSoft task 1
 */
class NumberGame {


    public static void main(String[] args){
        Random rand = new Random();

        int userInput = 0;
        int score = 0;
        int selection = 0;

        do {
            int rand1 = rand.nextInt(10);
            System.out.println("=========Guess my number=======");
            System.out.print("Enter a number less than 10: ");
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            if (userInput == rand1){
                score++;
                System.out.println(" ");
                System.out.println("=========Correct=========");
                System.out.println("Enter 12 to Stop: ");
                System.out.print("Enter number 11 to play again : ");
                Scanner s = new Scanner(System.in);
                selection = s.nextInt();
            }else {
                System.out.println(" ");
                System.out.println("Incorrect");
                System.out.println("Enter 12 to Stop: ");
                System.out.print("Enter number 11 to play again : ");
                Scanner s = new Scanner(System.in);
                selection = s.nextInt();
            }

        }while (selection != 12);

        System.out.println("Your Score is: "+score);

    }
}