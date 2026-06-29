import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int c = 0;
        int n = sc.nextInt();
        while (sum < n) {
            c += 1;
            sum += c;
        }
        System.out.println(c);
    }
}