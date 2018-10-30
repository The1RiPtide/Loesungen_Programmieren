public class arrayUebung
{
    int[] createArray(int length)
    {
        int[] array;
        if(0<length)
        {
            array = new int[length];
            for(int i= 0; i<length; i++)
            {
                array[i]=i;
            }
        }
        else
        {
            array = new int[0];
        }
        return array;
    }


}
