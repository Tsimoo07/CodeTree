import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int tot = 0;
        for (int i=0; i<16; i++) {
            int n = sc.nextInt();
            if (n%5==0) {tot++;}
        }
        System.out.println(tot);
    }
}