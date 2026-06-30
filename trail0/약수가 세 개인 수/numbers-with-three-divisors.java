import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int c = 0;
        for (int i=start; i<=end; i++) {
            int n = 2;
            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    n += 1;
                    if (n>3) {break;}
                }
            }
            if (n==3) {c++;}
        }
        System.out.println(c);
    }
}