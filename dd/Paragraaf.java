import java.util.*;
public class Paragraaf
{
    private String titel;
    private ArrayList<Zin> zinnen;

    public Paragraaf(String titel)
    {
        this.titel = titel;
        this.zinnen = new ArrayList<Zin>();
    }
    
    public String geefTitel()
    {
        return titel;
    }
    
    public void voegToeZin(String heleZin)
    {
        Zin zin = new Zin();
        String[] woorden = heleZin.split(" ");       
        for (String losWoord : woorden)
        {
            Woord volgendWoord = new Woord(losWoord);
            zin.voegToeWoord(volgendWoord);
        }
        zinnen.add(zin);
    }
    
    public int geefAantalTekens()
    {
        int aantalTekens = 0;
        for (Zin zin : zinnen)
        {
            aantalTekens += zin.geefAantalTekens();
        }
        return aantalTekens;
    }
}
