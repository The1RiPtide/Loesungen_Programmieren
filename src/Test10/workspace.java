package Test10;


import java.io.InputStream;

import static java.lang.Thread.sleep;

public class workspace
{
    public static void main(String[] args) throws InterruptedException
    {

        InputStream stream = System.in;
        FussballResultate fussballResultate1 = new FussballResultate(stream);

        Thread t = new Thread(fussballResultate1);
        t.start();


        System.out.println("nach dem start");

        while (!fussballResultate1.isFinished()){
            sleep(2);
        }
        System.out.println("fertig");
        for (String result : fussballResultate1.getResults())
        {
            System.out.println(result);
        }
    }

}
