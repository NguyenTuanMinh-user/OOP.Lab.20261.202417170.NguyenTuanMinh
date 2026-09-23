import java.util.Scanner;
public class Triangle_Ex63 {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n <= 0) {
            System.out.println("INVALID!");
            n = scn.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        scn.close();
    }
}
