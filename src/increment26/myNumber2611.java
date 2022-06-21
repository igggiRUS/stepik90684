package increment26;

import java.util.Scanner;

public class myNumber2611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(--x + " " + ++x + " " + ++x);
    }
}
