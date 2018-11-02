import java.lang.Math;

public class workspace
{
    public static void main(String[] args)
    {
        System.out.println(Math.pow(0,Double.NEGATIVE_INFINITY));
        System.out.println(Math.pow(-1, Double.NEGATIVE_INFINITY));
        System.out.println(Math.pow(-2, Double.NEGATIVE_INFINITY));
        System.out.println(Math.pow(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
        System.out.println(Math.pow(Double.NEGATIVE_INFINITY, Double.NaN));
        System.out.println(Math.pow(Double.NEGATIVE_INFINITY, Double.NaN));
        System.out.println(Math.pow(Double.NaN,1));
        System.out.println(Math.pow(Double.NaN,Double.NaN));
        System.out.println(Math.pow(Double.NaN,Double.MAX_VALUE));


        int i= -3;
        int g = 12;

        System.out.println(Math.max(0, Math.min(10,i)));
        System.out.println(Math.max(0, Math.min(10,g)));
        System.out.println(Math.min(0, Math.max(10,i)) );
        System.out.println(Math.min(0, Math.max(10,g)) );
    }

}
