
import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your course : ");
        String course = sc.nextLine();
        System.out.print("Enter your university rollno : ");
        int rn = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your semester ");
        int sem = sc.nextInt();
        System.err.println("The details that are given by the user ");
        System.err.println(name);
        System.err.println(course);
        System.out.println(rn);
        System.out.println(sem);
    }
}