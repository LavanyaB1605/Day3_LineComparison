import java.util.Scanner;

public class LenghtLine {
    public static void main(String[]args) {
        System.out.println("Enter the coordinates");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value for y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value for x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the value for y2");
        int y2 = sc.nextInt();
        double l = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line is: " + l);
    }
}
