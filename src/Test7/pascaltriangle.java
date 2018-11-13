package Test7;



public class pascaltriangle
{
    static int pascaltriangle(int zeile, int stelle)
    {
        if (stelle == 0 || zeile - stelle == 0) //If one of these cases = true, the rim was reached, it can return "1"
        {
            return 1;
        }
        else
        {
            return (pascaltriangle(zeile - 1, stelle - 1) + pascaltriangle(zeile - 1, stelle));
        } //This keeps reopening itself until it reaches the rim, at which point it will return one and keep adding all
          //of the above values, while it goes down the pyramid.
    }

    public static void main(String[] args)
    {
        System.out.println(pascaltriangle(3, 2)); //test call
    }
}
