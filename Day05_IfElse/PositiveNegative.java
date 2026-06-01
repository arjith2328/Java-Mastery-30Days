import java.util.Scanner;

class PositiveNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("Number is Postivie");
        }
        else if(a < 0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}