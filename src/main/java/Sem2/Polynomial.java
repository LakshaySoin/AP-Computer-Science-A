import java.util.ArrayList;
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> y = new ArrayList<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> val = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++){
            val.add(console.nextInt());
        }

        for (int i =0; i < val.size(); i++) {
            if (i % 2 == 1) {
                y.add(val.get(i));
            } else {
                x.add(val.get(i));
            }
        }
        double a11 = Math.pow(x.get(0),3);
        double a12 = Math.pow(x.get(0),2);
        double a13 = x.get(0);
        double a14 = 1;

        double a21 = Math.pow(x.get(1),3);
        double a22 = Math.pow(x.get(1),2);
        double a23 = x.get(1);
        double a24 = 1;

        double a31 = Math.pow(x.get(2),3);
        double a32 = Math.pow(x.get(2),2);
        double a33 = x.get(2);
        double a34 = 1;

        double a41 = Math.pow(x.get(3),3);
        double a42 = Math.pow(x.get(3),2);
        double a43 = x.get(3);
        double a44 = 1;

        double k1 = y.get(0);
        double k2 = y.get(1);
        double k3 = y.get(2);
        double k4 = y.get(3);


        double[] answer = solve4x4LinearEquation(
                a11,  a12,  a13,  a14,
                a21,  a22, a23,   a24,
                a31,  a32,  a33,   a34,
                a41,  a42,  a43,  a44,
                k1, k2, k3, k4);
        int a = (int)answer[0];  //x1 = -1
        int b = (int)answer[1];  //x2 =  1
        int c = (int)answer[2];  //x3 = -2
        int d = (int)answer[3];  //x4 =  3
        String A = "" + a;
        String B = "+ " + b;
        String C = "+ " + c;
        String D = "+ " + d;
        if(a < 0) {
            A = "- " + Math.abs(a);
        }
        if(a == 1 || a == -1){
            A = A.replace("1", "");
            A = A.replace("-1", "");
        }
        else if (a == 0){
            A = "";
        }
        if(b < 0) {
            B = "- " + Math.abs(b);
        }
        if(b == 1 || b == -1){
            B = B.replace("1", "");
            B = B.replace("-1", "");
        }
        else if (b == 0){
            B = "";
        }
        if(c < 0) {
            C = "- " + Math.abs(c);
        }
        if(c == 1 || c == -1){
            C = C.replace("1", "");
            C = C.replace("-1", "");
        }
        else if (c == 0){
            C = "";
        }
        if(d < 0) {
            D = "- " + Math.abs(d);
        }
        if(d == 1 || d == -1){
            D = D.replace("1", "");
            D = D.replace("-1", "");
        }
        else if (d == 0){
            D = "";
        }
        System.out.println();
        System.out.println("y = " + A + "x^3 " + B + "x^2 " + C + "x " + D);
    }

    public static double[] solve4x4LinearEquation(
            double a11, double a12, double a13, double a14,
            double a21, double a22, double a23, double a24,
            double a31, double a32, double a33, double a34,
            double a41, double a42, double a43, double a44,
            double k1,  double k2,  double k3,  double k4 )
    {
        double det = findDet4x4( a11, a12, a13, a14, a21, a22, a23, a24,
                a31, a32, a33, a34, a41, a42, a43, a44 );

        if( det == 0.0 )
        {
            return( null );    //No unique solution
        }

        double[] answer = new double[4];
        answer[0] = findDet4x4(  k1, a12, a13, a14, k2,  a22, a23, a24,
                k3, a32, a33, a34, k4,  a42, a43, a44 )/det;
        answer[1] = findDet4x4( a11,  k1, a13, a14, a21,  k2, a23, a24,
                a31,  k3, a33, a34, a41,  k4, a43, a44 )/det;
        answer[2] = findDet4x4( a11, a12,  k1, a14, a21, a22,  k2, a24,
                a31, a32,  k3, a34, a41, a42,  k4, a44 )/det;
        answer[3] = findDet4x4( a11, a12, a13,  k1, a21, a22, a23,  k2,
                a31, a32, a33,  k3, a41, a42, a43,  k4 )/det;
        return( answer );
    }
    private static double findDet3x3(
            double a11, double a12, double a13,
            double a21, double a22, double a23,
            double a31, double a32, double a33 )
    {
        return( a11*a22*a33 + a12*a23*a31 + a13*a21*a32 -
                a13*a22*a31 - a12*a21*a33 - a11*a23*a32 );
    }

    private static double findDet4x4(
            double a11, double a12, double a13, double a14,
            double a21, double a22, double a23, double a24,
            double a31, double a32, double a33, double a34,
            double a41, double a42, double a43, double a44 )
    {
        return( a11*findDet3x3(a22, a23, a24, a32, a33, a34, a42, a43, a44) -
                a12*findDet3x3(a21, a23, a24, a31, a33, a34, a41, a43, a44) +
                a13*findDet3x3(a21, a22, a24, a31, a32, a34, a41, a42, a44) -
                a14*findDet3x3(a21, a22, a23, a31, a32, a33, a41, a42, a43));
    }

}