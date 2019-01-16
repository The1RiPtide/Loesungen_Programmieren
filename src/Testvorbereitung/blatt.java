package Testvorbereitung;

public class blatt extends knoten
{
    private int schluessel;
    private String wert;

    blatt(int schluessel, String wert)
    {
        super(schluessel);

        this.wert = wert;
    }

    public String getWert()
    {
        return this.wert;
    }
}
