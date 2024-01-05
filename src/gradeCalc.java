import java.util.Scanner;
/*
  CodSoft Task 2
  Author -: Thusith Wickramasinghe
 */
public class gradeCalc {
    public static void main(String[] args){
        System.out.println("=======Grade Calculator=======");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subjects amount:");
        int amount = sc.nextInt();
        int sum = 0;
        for (int i=0;i<amount;i++){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Marks:");
            int marks = s.nextInt();
            sum+=marks;
        }
        double avg = (double) sum /amount;
        System.out.println("Total marks is: "+sum);
        System.out.println("Average marks is: "+avg);
        System.out.println(" ");

        // Calculate the Grade
        if (avg < 40) {
            System.out.println("Your grade is D");
        } else if (40<= avg && avg < 65) {
            System.out.println("Your grade is C");
        } else if (65<= avg && avg < 75) {
            System.out.println("Your grade is B");
        } else if (75<= avg && avg <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
