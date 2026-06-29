import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] fruit = {"apple","banana","grape","blueberry","orange"};
        String[] alp = {""};
        alp[0] = sc.next();
        char a = alp[0].charAt(0);
        int c = 0;
        for (int i=0; i<5; i++) {
            if (a == fruit[i].charAt(2) || a == fruit[i].charAt(3)) {
                System.out.println(fruit[i]);
                c++;
            }
        }
        System.out.println(c);
    }
}