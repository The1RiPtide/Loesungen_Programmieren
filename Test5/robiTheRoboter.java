public class robiTheRoboter
{
    public static void main(String[] args)
    {
        System.out.println(detectIfAngry("dummer roboter"));
    }
    static boolean detectIfAngry(String input)
    {
        try
        {
            String[] separateWords;
            separateWords = input.split("\\s");
            String alertWord = "roboter";

            String secondWord = separateWords[1].toLowerCase();
            String thirdWord;

            if (secondWord.contains(alertWord))
            {
                return true;
            }
            else if(separateWords.length >= 2)
            {
                thirdWord = separateWords[2].toLowerCase();

                if (thirdWord.contains(alertWord))
                {
                    return true;
                }
            }
            else return false;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
        return false;

    }
}
