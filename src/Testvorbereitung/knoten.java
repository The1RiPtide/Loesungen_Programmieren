package Testvorbereitung;

public abstract class knoten
{
    private int schluessel;

    knoten(int schluessel)
    {
        this.schluessel = schluessel;
    }

    public int getSchluessel()
    {
        return this.schluessel;
    }
}
