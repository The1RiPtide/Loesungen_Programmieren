public class moronicMethod
{
    public static void main(String[] args)
    {
        totallyMoronicMethod("FIND FIRST WORD du Ein scheiss Programm, dass bist du! ");
    }
    static int totallyMoronicMethod(String input)
    {
        String[] instructions = input.split("\\s", 5); //divide the input into a string AFTER every space
        String sentence = instructions[4];

        System.out.println(sentence);

        String givenSample;
        if (instructions[2].equals("CHAR")) //if the instruction said to search for char
        {
            givenSample = Character.toString(instructions[3].charAt(0));
        }
        else if (instructions[2].equals("WORD")) //now the same for word
        {
            givenSample = instructions[3];
        }
        else return -1;

        if (instructions[1].equals("FIRST")) //if the first instance of char is wanted
            {
                int firstAtPosition = sentence.indexOf(givenSample);
                return firstAtPosition;
            }
            else if (instructions[1].equals("LAST")) //if the last instance of char is wanted
            {
                int lastAtPosition = sentence.lastIndexOf(givenSample);
                return lastAtPosition;
            }
            else return -1;
        }
    }


