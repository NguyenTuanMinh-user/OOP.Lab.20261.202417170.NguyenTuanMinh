import java.util.Arrays;
import java.util.Scanner;
public class Array_Ex65 {
    public static void main(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum = 0; int avg = 0;
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        avg = sum / n;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The sum and the average value of the array are " + sum + " and " + avg);
    }
}
