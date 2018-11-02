package Test6;

public class Nummeriert
{
    static int numberOfObjects;
    int myID;

    public Nummeriert()
    {
        this.myID = Nummeriert.numberOfObjects;
        Nummeriert.numberOfObjects++;
    }

    public int meineID()
    {
        return myID;
    }
}
