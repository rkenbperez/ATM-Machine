import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int bal = (int)(Math.random() * 10001); /// Generates a random amount of money to your balance

    while(true){ 
            
            /// Introduction
            System.out.println("Greetings, this is an ATM. ");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            
            
            int input = sc.nextInt();


            /// Case from the input
            switch (input){
                case 1:
                System.out.println("Input the amount of money you want to withdraw: ");/// Withdraw some money to your account
                        Scanner wd = new Scanner(System.in);
                        int WD = wd.nextInt();
                        int withdraw = WD;
                        int amount = bal - withdraw;
                        if (bal > WD){
                            System.out.println("This is now you balance: " + amount + "$");
                            System.out.println("From your balance: " + bal + "$");
                            }
                        else {
                            System.out.println("Your balance falls short of the amount you entered.");
                        }
                        
                    break;
                case 2:
                    System.out.println("Input the amount of money you want to deposit: ");/// Deposit some money to your account
                    Scanner dp = new Scanner(System.in);
                        int DP = dp.nextInt();
                        int deposit = DP;
                        int amountAdd = bal + deposit;
                        System.out.println("This is now you balance: " + amountAdd + "$");
                        System.out.println("From your balance: " + bal + "$");
                    break;
                case 3:
                    System.out.println("This is you current balance: ");///Checks out your balance
                    System.out.println(bal +"$");
                    break;
                case 4:
                    System.out.println("You have been Exited!");/// To exit the ATM   
                    System.exit(input);  
            }
        }
    }
}
