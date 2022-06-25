package ifElse31;

import java.util.Scanner;

public class MyProg3110 {
	
	public static void main(String[] args) {
		System.out.println("введите число: ");
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
//        ИЛИ ИЛИ тернарный 
        System.out.println((boolean)(a == 3));
        System.out.println((a == 3) || (a == 4) || (a == 5) ? "YES" : "NO");
	}
}