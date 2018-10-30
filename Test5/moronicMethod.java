public class moronicMethod
{
    static int totallyMoronicMethod(String input)
    {
        String[] instructions = input.split("\\s", 5); //divide the input into a string at every space but
        //but only the first 4 Parts: FIND, FIRST/LAST, CHAR/WORD, sample, and the fifth is the rest of the Strin, aka the sentence
        String sentence = instructions[4];

        String givenSample; //this is what we will search for in the final Sentence

        if (instructions[2].equals("CHAR")) //if the instruction said to search for char
        {
            givenSample = Character.toString(instructions[3].charAt(0));
        } else if (instructions[2].equals("WORD")) //now the same for word
        {
            givenSample = instructions[3];
        } else
        {
            return -1;
        }

        if (instructions[1].equals("FIRST")) //if the first instance of char/word is wanted
        {
            int firstAtPosition = sentence.indexOf(givenSample);
            return firstAtPosition;
        } else if (instructions[1].equals("LAST")) //if the last instance of char/word is wanted
        {
            int lastAtPosition = sentence.lastIndexOf(givenSample);
            return lastAtPosition;
        } else
        {
            //default case if the instructions were wrong
            return -1;
        }
    }
}


