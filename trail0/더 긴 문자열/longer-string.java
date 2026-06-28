import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sent1 = sc.next();
        String sent2 = sc.next();
        if (sent1.length() > sent2.length()) {System.out.println(sent1+" "+sent1.length());}
        else if (sent1.length() < sent2.length()) {System.out.println(sent2+" "+sent2.length());}
        else {System.out.println("same");}
    }
}