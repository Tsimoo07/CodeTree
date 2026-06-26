import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = a+b+c;
        int aver = (a+b+c)/3;
        int d = s-aver;
        System.out.println(s);
        System.out.println(aver);
        System.out.println(d);
    }
}