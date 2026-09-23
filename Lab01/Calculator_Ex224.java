import java.util.Scanner;
public class Calculator_Ex224 {
    public static void main(){
        double a, b;
        Scanner scn = new Scanner(System.in);
        a = scn.nextDouble();
        b = scn.nextDouble();
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if(b != 0){
            System.out.println("Quotient: " + quotient);
        }
        else System.out.println("Quotient: Invalid!");
        scn.close();
    }
}