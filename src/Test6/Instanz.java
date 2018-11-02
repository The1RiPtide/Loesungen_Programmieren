package Test6;

public class Instanz
{
    static int numberOfObjects;


    public Instanz()
    {
        Instanz.numberOfObjects++;
    }

    public static  int anzahlInstanzen()
    {
        return Instanz.numberOfObjects;
    }
}
