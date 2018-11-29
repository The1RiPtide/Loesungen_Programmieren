package Test9;

public class Buzzer // enthält einen fehler, weiss aber nicht wo...
{
    static private int gedrückteBuzzer = 0;

    boolean buzzerGedrückt = false;

    public void buzz()
    {
        if (!buzzerGedrückt)
        {
            Buzzer.gedrückteBuzzer++;
        }
    }

    public void resetBuzzer()
    {
        this.buzzerGedrückt = false;
    }

    public static int getCounter()
    {
        return Buzzer.gedrückteBuzzer;
    }

    public static void resetCounter()
    {
        Buzzer.gedrückteBuzzer = 0;
    }
}
