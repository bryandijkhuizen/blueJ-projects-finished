import java.util.*;
public class Zin
{
    private ArrayList<Woord> woorden;

    public Zin()
    {
        this.woorden = new ArrayList<Woord>();
    }    

    public Zin(String heleZin)
    {
        this.woorden = new ArrayList<Woord>();
        String[] losseWoorden = heleZin.split(" ");       
        for (String losWoord : losseWoorden)
        {
            Woord volgendWoord = new Woord(losWoord);
            this.woorden.add(volgendWoord);
        }       
    }
    
    public void voegToeWoord(Woord woord)
    {
        woorden.add(woord);
    }
 
    public int geefAantalTekens()
    {
        // Zet hier je code t.b.v. opgave 3!
        int tekens = 0;
        Iterator<Woord> it = this.woorden.iterator();
        while(it.hasNext()) {
            Woord woord = it.next();
            tekens += woord.geefAantalTekens();
        }
        return tekens;
    }
    
    public String geefZin()
    {
        String output = woorden.get(0).geefWoord();
        for(int woordNummer = 1; woordNummer < woorden.size(); woordNummer++)
        {
            output += " " + woorden.get(woordNummer).geefWoord();
        }
        return output;
    }

    public String geefZinAchterstevoren()
    {
        int aantalWoorden = woorden.size();
        String output = woorden.get(aantalWoorden - 1).geefWoordAchterstevoren();
        for(int woordNummer = aantalWoorden - 2; woordNummer >= 0; woordNummer--)
        {
            output += " " + woorden.get(woordNummer).geefWoordAchterstevoren();
        }
        return output;
    }
}
