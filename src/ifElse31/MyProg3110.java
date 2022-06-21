package ifElse31;

import java.util.Scanner;

public class MyProg3110 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
//        ИЛИ ИЛИ тернарныйего
        System.out.println((a == 3) || (a == 4) || (a == 5) ? "YES" : "NO");
	}
}