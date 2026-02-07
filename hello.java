import java.util.Scanner;
class MotorVechile{
    String modelName;
    int modelNumber;
    int modelPrice;
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the model name : ");
        modelName= sc.nextLine();
        System.out.print("Enter the model number : ");
        modelNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the price of the model : ");
        modelNumber = sc.nextInt();
    }

}
class Carthat extends MotorVechile{
    int discountRate;
    
}