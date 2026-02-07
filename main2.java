
import java.util.Scanner;

class school{
    int s1,s2,s3;
        int av;
        void scores(){
            Scanner sc = new Scanner(System.in);
            System.err.println("Enter your subjects marks");
            System.out.print("Enter the 1st subject marks : ");
            s1= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the 2nd subject marks : ");
            s2= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the 3rd subject marks : ");
            s3= sc.nextInt();
        }
        void average(){
            av = (s1+s2+s3)/3;
            System.out.print("Average of the marks are : ");
            System.out.println(av);
        }
        void Grades(){
            System.out.println("Your grade is : ");
            if(av>=90){
                System.out.print("A");
            }
            else if(av>=80 && av<90){
                 System.out.print("B");
            }
            else if(av>=70 && av<80){
                 System.out.print("C");
            }
            else if(av>=60 && av<70){
                 System.out.print("D");
            }
            else{
                 System.out.print("E");
            }
        }
}
class main2{ 
   public static void main(String[] args) {
       school sc = new school();
       sc.scores();
       sc.average();
       sc.Grades();
   }
}