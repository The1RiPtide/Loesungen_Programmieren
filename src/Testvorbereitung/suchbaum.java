package Testvorbereitung;

public class suchbaum
{
    private knoten wurzel;

    public knoten getwurzel()
    {
        return wurzel;
    }

    public void eifuegen(int schlüssel, String wert)
    {
        if(this.wurzel == null)
        {
            this.wurzel = new blatt(schlüssel, wert);

            return;
        }

        if(this.wurzel instanceof blatt)
        {
            balblaba
        }
    }

    public static String suchen(int schluessel)
    {
        return "";
    }
}
