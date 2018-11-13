package Test7;

import org.xml.sax.Locator;

public class LocatorError implements Locator
{
    @Override
    public String getPublicId()
    {
        return "gaggi error";
    }

    @Override
    public String getSystemId()
    {
        return "gaggi error";
    }

    @Override
    public int getLineNumber()
    {
        return -1;
    }

    @Override
    public int getColumnNumber()
    {
        return -1;
    }
}