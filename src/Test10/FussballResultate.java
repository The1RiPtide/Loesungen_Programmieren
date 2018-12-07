package Test10;
import java.io.*;
public class FussballResultate extends Thread
{
    private String[] gespeicherteResultate = new String[20];
    InputStreamReader original;
    BufferedReader reader;
    boolean isFinished = false;

    FussballResultate(InputStream resultate)
    {
        for(int i = 0; i < this.gespeicherteResultate.length; i++)
        {
            gespeicherteResultate[i] = "";
        }
        this.original = new InputStreamReader(resultate);
        this.reader = new BufferedReader(this.original);
    }

    public String[] getResults()
    {
        return this.gespeicherteResultate;
    }

    @Override
    public void run()
    {
        try
        {
            String ausgelesen;
            for (int i = 0;  i < this.gespeicherteResultate.length && (ausgelesen = this.reader.readLine()) != null ; i++)
            {
                this.gespeicherteResultate[i] = ausgelesen;
            }
            this.isFinished = true;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean isFinished()
    {
        return isFinished;
    }


}
