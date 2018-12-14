package Test11;

import org.xml.sax.Locator;

public class MeineAnonymeSuche
{
    public static Locator erstelleFehler()
    {

        Locator fehler = new Locator()
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
        };
        return fehler;
    }
}
