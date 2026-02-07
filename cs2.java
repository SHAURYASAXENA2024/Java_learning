
import java.util.Scanner;

class cs2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 2 numers ");
        System.out.print("Enter the 1st number : ");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the 2nd number : ");
        num2 = sc.nextInt();
        sc.nextLine();
        int sum,sub;
        sum = num1+num2;
        if(num1>num2){
            sub = num1-num2;
        }
        else{
            sub = num2-num1;
        }
        System.out.println("Enter the operation want to perform :");
        String operation = sc.nextLine();
        switch(operation){
            case "sum":
                System.out.print(sum);
                break;
            case "sub":
                System.out.print(sub);
                break;
            default:
                System.out.print("ther is no valid opeartion");
                break;
        }
    }   
}