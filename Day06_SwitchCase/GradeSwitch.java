import java.util.Scanner;

class GradeSwitch{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter Grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        switch(grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;
            
            case 'C':
                System.out.println("Average");
                break;
                
            default:
                System.out.println("Invalid Grade");
        }
    }
}