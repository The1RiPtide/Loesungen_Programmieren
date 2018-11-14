package Test7;

public class rekursionII
{
    static int f1(int p1) {
        if (p1 <= 0) return 1;
        return p1 * f1(p1-1);
    }

    static String f2(String p1, int p2, boolean p3) {
        if (p2 <= 1 ) return p1;
        String s = "?";
        if (p3) s = "!";
        return f2(p1 + s + p1, p2 - 3, !p3);
    }

    public static void main(String[] args)
    {
        System.out.println(f1(3));
        System.out.println(f1(5));

        System.out.println(f2("X", 7, false));
    }
}
