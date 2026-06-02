import java.util.Scanner;

class MonthFinder{
    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month Number: ");
        int month = sc.nextInt();

        switch(month){

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            default:
                System.out.println("Month not added yet");
        }
    }
}