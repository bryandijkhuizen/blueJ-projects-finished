import java.util.*;
public class Afstudeerverslag
{
    private double cijfer;
    private String titel;
    private Persoon student;
    private ArrayList<Hoofdstuk> hoofdstukken;

    public Afstudeerverslag(String titel, Persoon student)
    {
        this.cijfer = 0.0;
        this.titel = titel;
        this.student = student;
        this.hoofdstukken = new ArrayList<Hoofdstuk>();
    }
        
    public void voegToeHoofdstuk(Hoofdstuk hoofdstuk)
    {
        hoofdstukken.add(hoofdstuk);
    }
    
    public int geefAantalHoofdstukken()
    {
        return hoofdstukken.size();
    }
    
    public int geefAantalParagrafen()
    {
        int aantalParagrafen = 0;
        for (Hoofdstuk hoofdstuk : hoofdstukken)
        {
            aantalParagrafen += hoofdstuk.geefAantalParagrafen();
        }
        return aantalParagrafen;
    }
    
    public int geefAantalTekens()
    {
        int aantalTekens = 0;
        for (Hoofdstuk hoofdstuk : hoofdstukken)
        {
            aantalTekens += hoofdstuk.geefAantalTekens();
        }
        return aantalTekens;
    }
    
    public String geefInhoudsOpgave()
    {
        // Zet hier je code t.b.v. opgave 6!
        // hoofdstuk.geefInhoudsOpgave(hoofdstukNummer);
        String inhoudsopgave = "";
        for(int i = 0; i < this.hoofdstukken.size(); i++) {
            inhoudsopgave += "Hoofdstuk " + (i+1) + " " + this.hoofdstukken.get(i).geefTitel() + "\n";
            inhoudsopgave += this.hoofdstukken.get(i).geefInhoudsOpgave(i+1);
        }
        return inhoudsopgave;
    }
}
