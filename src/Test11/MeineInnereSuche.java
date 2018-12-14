package Test11;

import org.xml.sax.Locator;

public class MeineInnereSuche
{
    public Locator erstelleFehler()
    {
        Locator fehler = new innerclass();
        return fehler;
    }

    class innerclass implements Locator
    {

        @Override
        public String getPublicId()
        {
            return null;
        }

        @Override
        public String getSystemId()
        {
            return null;
        }

        @Override
        public int getLineNumber()
        {
            return 0;
        }

        @Override
        public int getColumnNumber()
        {
            return 0;
        }
    }
}
