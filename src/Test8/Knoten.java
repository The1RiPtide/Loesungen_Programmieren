package Test8;

public class Knoten
{
    Knoten vor;
    Knoten nach;

    static Knoten head;
    static Knoten tail;

    public void platzierenNach(Knoten element)
    {
        Knoten nachher = new Knoten();

        element.nach = this.nach;
        element.vor = this;
        this.nach = element;

        if(element.nach != null)
        {
            nachher = element.nach;
            nachher.vor = element;
        }
    }
}
