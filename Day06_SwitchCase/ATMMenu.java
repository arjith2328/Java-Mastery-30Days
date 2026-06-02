import java.util.Scanner;

class ATMMenu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Choose Option: ");
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Balance = ₹5000");
                break;

            case 2:
                System.out.println("Deposit Selected");
                break;

            case 3:
                System.out.println("Withdraw Selected");
                break;

            default:
                System.out.println("Invalid Option");
        }

    }
}