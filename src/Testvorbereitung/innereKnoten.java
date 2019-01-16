package Testvorbereitung;

public class innereKnoten extends knoten
{

    private knoten linkesKind;
    private knoten rechtesKind;

    public innereKnoten(int schlüssel, knoten linkesKind, knoten rechtesKind)
    {
        super(schlüssel);

        this.linkesKind = linkesKind;
        this.rechtesKind = rechtesKind;

    }

    public knoten getLinkesKind()
    {
        return linkesKind;
    }

    public knoten getRechtesKind()
    {
        return rechtesKind;
    }

    public void setLinkesKind(knoten linkesKind)
    {
        this.linkesKind = linkesKind;
    }

    public void setRechtesKind(knoten rechtesKind)
    {
        this.rechtesKind = rechtesKind;
    }
}
