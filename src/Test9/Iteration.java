package Test9;

public class Iteration
{
    public static int iterativ(int startwert, int k)
    {
        if (startwert == 1)
        {
            return 0;
        }
        for (int i = k; i > 0;i-- )
        {
            if(startwert == 1)
            {
                break;
            }
            else if (startwert%2 == 0)
            {
                startwert = startwert / 2;
            }
            else
            {
                startwert = startwert * 3 + 1;
            }
        }

        return startwert;
    }
    public static void main(String[] args)
    {
        System.out.println(iterativ(5,1));
        System.out.println(iterativ(1,3));
        System.out.println(iterativ(2,25));
    }
}
