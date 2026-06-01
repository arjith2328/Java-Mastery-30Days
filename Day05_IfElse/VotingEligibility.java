import java.util.Scanner;

class VotingEligibility{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int a = sc.nextInt();

        if(a >= 18){
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible for Voting");
        }
    }
}