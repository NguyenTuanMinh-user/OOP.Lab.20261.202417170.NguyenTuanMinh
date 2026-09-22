import java.util.Arrays;
public class MathSolver_Lab01_Ex225 {
    public static void main(){

        LinearEquation LNeq = new LinearEquation();
        LinearSystem sys = new LinearSystem();
        QuadraticEquation Qeq = new QuadraticEquation();
        double res1 = LNeq.solve(1, 2);
        double[] res2 = sys.solve(2, 5, 7, 6, -2, 4);
        double[] res3 = Qeq.solve(1, -5, 6);
        System.out.println("Result of the linear equation: " + res1);
        System.out.println("Result of the linear system of equations: " + Arrays.toString(res2));
        System.out.println("Result of  the quadratic equation: " + Arrays.toString(res3));
    }
}
class LinearEquation{
    public static double solve(double a, double b){
        if(a==0) return Double.NaN;
        else return -b/a;
    }
}
class LinearSystem{
    public static double[] solve(double a11, double a12, double b1, double a21, double a22, double b2){
        double D = a11*a22 - a21*a12;
        double Dx = b1*a22 - b2*a12;
        double Dy = a11*b2 - a21*b1;
        if (D != 0) {
            double x1 = Dx / D;
            double x2 = Dy / D;
            return new double[]{x1, x2};
        }
        else return null;
    }
}
class QuadraticEquation{
    public static double[] solve(double a, double b, double c){
        if (a == 0) {
            return new double[]{-c/b};
        }
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            return new double[]{};
        } else if (delta == 0) {
            double x = -b / (2*a);
            return new double[]{x};
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            return new double[]{x1, x2};
        }
    }
}