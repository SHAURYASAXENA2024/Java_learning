import java.util.Scanner;
class arr{
    public static void main(String[] args) {
        char vowels[] ={'a','e','i','o','u'};
        System.out.println(vowels[2]);
        Scanner sc = new Scanner(System.in);
        char v[] = new char[10];
        for(int i=0; i<v.length; i++){
            v[i]=sc.next().charAt(i);
        }
    }
}