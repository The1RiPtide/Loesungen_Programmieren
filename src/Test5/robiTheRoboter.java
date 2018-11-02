package Test5;

public class robiTheRoboter
{
    static boolean detectIfAngry(String input)
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
        else if(separateWords.length > 2)
        {
            thirdWord = separateWords[2].toLowerCase();

            if (thirdWord.contains(alertWord))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else return false;



    }
}
