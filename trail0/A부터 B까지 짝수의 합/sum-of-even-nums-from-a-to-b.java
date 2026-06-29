import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int tot = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=a; i<=b; i++) {
            if (i%2==0) {tot += i;}
        }
        System.out.println(tot);
    }
}