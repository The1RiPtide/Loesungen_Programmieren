package Test9;

public class Rekursion
{
    public int rekursiv(int startwert, int k)
    {
        if (k == 0)
        {
            return startwert;
        }

        if (startwert == 1)
        {
            return 1;
        }

        k--;

        if (startwert%2 == 0)
        {
            startwert = startwert/2;
            return rekursiv(startwert, k);
        }
        else
        {
            startwert = 3 * startwert +1;
            return rekursiv(startwert, k);
        }
    }
}
