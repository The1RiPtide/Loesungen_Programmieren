public class cd
{
    String[] titles;
    int[] durations;

    cd()
    {
        this.titles = new String[0];
        this.durations = new int[0];
    }

    cd(String title, int duration)
    {
        this.titles = new String[1];
        this.durations = new int[1];
        this.titles[0] = title;
        this.durations[0] = duration;
    }

}
