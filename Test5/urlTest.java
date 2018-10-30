public class urlTest
{
    static boolean isThisWebsiteRelevant(String URL)
    {
        String unibas = "unibas.ch";

        int firstOccurrence = URL.indexOf(unibas);

        if (0 <= firstOccurrence && firstOccurrence < 15)
        {
            return true;
        }
        else return false;
    }

}
