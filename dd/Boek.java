import java.util.ArrayList;

public class Boek
{
    private String titel;
    private Persoon auteur;
    private ArrayList<String> hoofdstukken;
    private int uitgifteJaar;

    public Boek(String titel, Persoon auteur, ArrayList<String> hoofdstukken, int uitgifteJaar)
    {
        this.titel = titel;
        this.auteur = auteur;
        this.hoofdstukken = hoofdstukken;
        this.uitgifteJaar = uitgifteJaar;
    }
    
    public Boek(String titel, Persoon auteur)
    {
        this.titel = titel;
        this.auteur = auteur;
        this.hoofdstukken = new ArrayList<String>();
    }
    
    public String geefTitel()
    {
        return this.titel;
    }
    
    public Persoon geefAuteur()
    {
        return this.auteur;
    }
    
    public ArrayList<String> geefHoofdstukken()
    {
        return this.hoofdstukken;
    }
    
    public int geefUitgifteJaar()
    {
        return this.uitgifteJaar;
    }
}
