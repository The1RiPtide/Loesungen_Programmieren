package Test6;

public class Nummeriert
{
    static int numberOfObjects;
    int myID;

    Nummeriert()
    {
        numberOfObjects++;
        this.myID = numberOfObjects;
    }

    int meineID()
    {
        return myID;
    }
}
