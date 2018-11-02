package Test6;

public class Sandbox {
    public static void main(String[] args)
    {
        D d2 = new D(3.0);
        D d3 = new D(1.0);
        System.out.println( D.d );
    }
}

class B { public static boolean b = true; }

class C { public char c = 'c'; }

class D {
    public static double d = 0.0;
    public float f = 3.f;

    public D( double d ) { D.d += d; }
    public D( float f ) { this.f = f; }
}