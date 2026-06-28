import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(!(year%100==0 && year%400!=0) && year%4==0);
    }
}