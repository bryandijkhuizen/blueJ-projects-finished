import java.util.*;
public class Hoofdstuk
{
    private String titel;
    private ArrayList<Paragraaf> paragrafen;

    public Hoofdstuk(String titel)
    {
        this.titel = titel;
        paragrafen = new ArrayList<Paragraaf>();
    }
        
    public String geefTitel()
    {
        return titel;
    }

    public void voegToeParagraaf(Paragraaf paragraaf)
    {
        paragrafen.add(paragraaf);
    }
        
    public int geefAantalParagrafen()
    {
        return paragrafen.size();
    }

    public int geefAantalTekens()
    {
        int aantalTekens = 0;
        for (Paragraaf paragraaf : paragrafen)
        {
            aantalTekens += paragraaf.geefAantalTekens();
        }
        return aantalTekens;
    }
    
    public String geefInhoudsOpgave(int hoofdstukNummer)
    {
        // Zet hier je code t.b.v. opgave 6!
        String inhoudsopgave = "";
        for(int i = 0; i < this.paragrafen.size(); i++) {
            inhoudsopgave += "Paragraaf " + hoofdstukNummer + "." + (i+1) + " " + this.paragrafen.get(i).geefTitel() + "\n";
        }
        return inhoudsopgave;
    }
}