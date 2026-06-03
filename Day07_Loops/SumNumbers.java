import java.util.Scanner;

class SumNumbers{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}