public class shittyMethod
{
    String shittyMethod(int firstInt, int secondInt, int thirdInt)
    {
        String firstString = Integer.toString(firstInt);
        if (secondInt < 0)
        {
            secondInt = secondInt * -1;
        }
        String secondString = Integer.toString(secondInt);

        String combination = firstString + secondString;
        int combinationOfInt = Integer.parseInt(combination);

        int result = combinationOfInt + thirdInt;

        String sumOfInts = Integer.toString(result);
        return ("Resultat: " + sumOfInts);
    }

}
