/**
 * De klasse voor personen.
 * 
 * @author Guido Lindeboom
 * @version 2018.12.12
 */
public class Persoon
{
    private String voornaam;
    private String achternaam;
    private int geboorteJaar;
    private int geboorteMaand;
    private int geboorteDagVanDeMaand;
    private int lengteInCm;

    /**
     * Constructor voor de klasse Persoon.
     * 
     * @param voornaam De voornaam van dit persoon.
     * @param achternaam De achternaam van dit persoon.
     * @param geboorteJaar Het geboortejaar van dit persoon.
     * @param geboorteMaand Het geboortemaand van dit persoon.
     * @param geboorteDagVanDeMaand De geboortedag van dit persoon.
     * @param lengteInCm De lengte in cm van dit persoon.
     */
    public Persoon(String voornaam, String achternaam, int geboorteJaar, int geboorteMaand, int geboorteDagVanDeMaand, int lengteInCm)
    {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboorteJaar = geboorteJaar;
        this.geboorteMaand = geboorteMaand;
        this.geboorteDagVanDeMaand = geboorteDagVanDeMaand;
        this.lengteInCm = lengteInCm;
    }

    /**
     * Berekent de lengte in meters en/of centimers.
     * 
     * @return De lengte in meters en/of centimeters.
     */
    public String geefLengteInMeters()
    {
        int aantalMeters = this.lengteInCm / 100;
        int aantalCentimeters = this.lengteInCm % 100;
        
        String output = "";
        if (aantalMeters == 0 && aantalCentimeters > 0) 
        {
            output = aantalCentimeters + " centimeter";
        }
        else if (aantalMeters > 0 && aantalCentimeters > 0) 
        {
            output = aantalMeters + " meter en " + aantalCentimeters + " centimeter";
        }
        else if (aantalMeters > 0 && aantalCentimeters == 0) 
        {
            output = aantalMeters + " meter";
        }
        return output;
    }
    
    /**
     * Berekent de huidige leeftijd.
     * 
     * @return De huidige leeftijd.
     */
    public int geefLeeftijd()
    {
        // Het is vandaag 12 december 2018;)
        int jaarNu = 2018;
        int maandNu = 12;
        int dagNu = 12;
        int leeftijd;
        if ((geboorteJaar == jaarNu) || (geboorteJaar == (jaarNu - 1) && geboorteMaand == maandNu && geboorteDagVanDeMaand > dagNu))
        {
            leeftijd = 0;
        }
        else if ((geboorteMaand < maandNu) || (geboorteDagVanDeMaand <= dagNu))
        {
            leeftijd = jaarNu - geboorteJaar;
        }
        else
        {
            leeftijd = jaarNu - geboorteJaar - 1;
        }
        
        return leeftijd;
    }
}
