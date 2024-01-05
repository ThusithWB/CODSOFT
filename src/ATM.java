import java.util.Scanner;
/*
   Author-: Thusith Wickramasinghe.
   CodSoft Task 3
*/
public class ATM {
    double amount=0;

    void deposit(int a) {
        amount+=a;
        System.out.println("=====Successful=====");
    }
    void withdraw(int a) {
        if (a>amount){
            System.out.println("=====Not Enough money.=====");
        }else {
            amount-=a;
            System.out.println("=====Transaction Successful=====");
        }
    }
    public void checkBalance(){
        System.out.println(" \nAvailable balance is "+amount+" Dollars.");
    }
}

class bankAccount {
    public static void main(String[] args) {
        ATM account1 = new ATM();
        int number;
        do {
            System.out.print(" \nEnter 1 for Deposit \nEnter 2 for check Balance \nEnter 3 for Withdraw\nEnter 0 to exit : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.print(" \nEnter amount to deposit:");
                    Scanner am = new Scanner(System.in);
                    int amount = am.nextInt();
                    account1.deposit(amount);
                    break;
                case 2:
                    account1.checkBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw:");
                    Scanner amn = new Scanner(System.in);
                    int with = amn.nextInt();
                    account1.withdraw(with);
                    break;
            }

        }while (number != 0);
    }
}
