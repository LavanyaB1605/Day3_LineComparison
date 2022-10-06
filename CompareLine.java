import java.util.Scanner;

public class CompareLine {
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
        int compare1 = Integer.compare(x1, y1);
        System.out.println("Comparing x1 and y1 = " + compare1);
        int compare2 = Integer.compare(x1, y1);
        System.out.println("Comparing x2 and y2 = " + compare2);
    }

}
