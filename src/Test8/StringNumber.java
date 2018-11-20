package Test8;

import java.io.CharConversionException;

public class StringNumber extends java.lang.Number
{
    private int theNumber;
    String[] numArray = {"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
    StringNumber(String num) throws CharConversionException
    {
        boolean found = false;
        for (int i = 0; i<this.numArray.length;i++)
        {
            if(this.numArray[i].equals(num))
            {
                this.theNumber = i;
                found = true;
                break;
            }
        }
        if(!found){
            throw new CharConversionException("not a StringNumber");
        }
    }
    @Override
    public int intValue()
    {
        return this.theNumber;
    }

    @Override
    public long longValue()
    {
        return this.theNumber;
    }

    @Override
    public float floatValue()
    {
        return this.theNumber;
    }

    @Override
    public double doubleValue()
    {
        return this.theNumber;
    }
}
