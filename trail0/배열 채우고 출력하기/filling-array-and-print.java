import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        for (int i=0; i<10; i++) {array[i] = sc.next();}
        for (int i=9; i>=0; i--) {System.out.print(array[i]);}
    }
}