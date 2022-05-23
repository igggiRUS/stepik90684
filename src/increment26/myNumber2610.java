package increment26;

public class myNumber2610 {
    public static void main(String[] args) {
        int x = 25;
        int y;
        y = x--;
        y++;
        y = y % x;
        x = x / y;
        x++;
        System.out.println(x);
    }
}