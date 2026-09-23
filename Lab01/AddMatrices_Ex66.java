import java.util.Scanner;
public class AddMatrices_Ex66 {
    public static void main(){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt(); int n = scn.nextInt();
        int[][] matA = new int[m][n];
        int[][] matB = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) matA[i][j] = scn.nextInt();
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) matB[i][j] = scn.nextInt();
        }
        int[][] matC = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) matC[i][j] = matA[i][j] + matB[i][j];
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) System.out.print(matC[i][j] + " ");
            System.out.println();
        }
        scn.close();
    }
}
