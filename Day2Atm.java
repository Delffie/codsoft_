import java.util.Scanner;
public class Day2Atm {

    public static void main(String[] args){
        double pin = 1234;
        double balance = 1000;
        System.out.println("Welcome To Atm!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin ");
        double PIN= scanner.nextDouble();

        if(PIN == pin){
            System.out.println("correct!");
            System.out.println("Enter choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("English");
                    break;
                case 2:
                    System.out.println("Tamil");
                    break;
                    }
            System.out.println("Enter the withdrawAmount");
            double withdrawAmount = scanner.nextDouble();
            if(withdrawAmount == 0) {
                System.out.println("invalid");
            } 
            else if (withdrawAmount > balance){
                 System.out.println( "pls enter the sufficent amount before withdraw");
            }
            else {
                balance -= withdrawAmount;
             System.out.println("current balance :" + balance );
            }
        }
        else {
            System.out.println("Incorrect Pin!");
        }
        System.out.println("THANK YOU!");
        scanner.close();
    }

}
