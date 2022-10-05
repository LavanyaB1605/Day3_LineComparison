import java.util.Scanner;

public class LineEquality {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value for y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value for x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the value for y2");
        int y2 = sc.nextInt();
        boolean len1 = x1 == (y1);
        System.out.println("Length of line is " + len1);
        boolean len2 = x2 == (y2);
        System.out.println("Length of line is " + len2);
    }
}
