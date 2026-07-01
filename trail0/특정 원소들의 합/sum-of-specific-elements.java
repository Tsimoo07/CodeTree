import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int tot = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int n = sc.nextInt();
                if (i>=j) {tot += n;}
            }
        }
        System.out.println(tot);
    }
}