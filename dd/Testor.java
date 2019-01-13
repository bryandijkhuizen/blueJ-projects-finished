import java.util.*;
public class Testor
{
    public Testor()
    {
    }
    
    public void test1Personen()
    {
        Persoon evert = new Persoon("Evert", "Nijkamp", 1969, 11, 11, 75);
        System.out.println(evert.geefLengteInMeters());     // 75 centimeter
        System.out.println(evert.geefLeeftijd());           // eerder al 49
        evert = new Persoon("Evert", "Nijkamp", 1969, 12, 12, 99);
        System.out.println(evert.geefLengteInMeters());     // 99 centimeter
        System.out.println(evert.geefLeeftijd());           // vandaag 49
        evert = new Persoon("Evert", "Nijkamp", 1969, 12, 13, 100);
        System.out.println(evert.geefLengteInMeters());     // 1 meter
        System.out.println(evert.geefLeeftijd());           // morgen 49, 48 dus
        evert = new Persoon("Evert", "Nijkamp", 2017, 8, 8, 101);
        System.out.println(evert.geefLengteInMeters());     // 1 meter en 1 centimeter
        System.out.println(evert.geefLeeftijd());           // 1
        evert = new Persoon("Evert", "Nijkamp", 2017, 12, 11, 199);
        System.out.println(evert.geefLengteInMeters());     // 1 meter en 99 centimeter
        System.out.println(evert.geefLeeftijd());           // 1
        evert = new Persoon("Evert", "Nijkamp", 2017, 12, 12, 200);
        System.out.println(evert.geefLengteInMeters());     // 2 meter
        System.out.println(evert.geefLeeftijd());           // vandaag 1
        evert = new Persoon("Evert", "Nijkamp", 2017, 12, 13, 201); // morgen 1
        System.out.println(evert.geefLengteInMeters());     // 2 meter en 1 centimeter
        System.out.println(evert.geefLeeftijd());           // 0
        evert = new Persoon("Evert", "Nijkamp", 2018, 8, 8, 210);
        System.out.println(evert.geefLengteInMeters());     // 2 meter en 10 centimeter
        System.out.println(evert.geefLeeftijd());           // 0
    }

    public void test3AnalyseerAfstudeerVerslag()
    {
        Afstudeerverslag afstudeerVerslagKerstman = geefAfstudeerverslag();
        System.out.println("Aantal hoofdstukken: " + afstudeerVerslagKerstman.geefAantalHoofdstukken());        // 3
        System.out.println("Aantal paragrafen:   " + afstudeerVerslagKerstman.geefAantalParagrafen());          // 10
        System.out.println("Aantal tekens:       " + afstudeerVerslagKerstman.geefAantalTekens());              // 1739
    }
    
    public void test4KlinkersTellen()
    {
        Woord langstePlaatsteNaamVanZuidAfrika = new Woord("Tweebuffelsmeteenskootmorsdoodgeskietfontein");
        int[] klinkerTeller = langstePlaatsteNaamVanZuidAfrika.telKlinkers();
        
        System.out.println("aantal a's:" + klinkerTeller[0]);
        System.out.println("aantal e's:" + klinkerTeller[1]);
        System.out.println("aantal i's:" + klinkerTeller[2]);
        System.out.println("aantal o's:" + klinkerTeller[3]);
        System.out.println("aantal u's:" + klinkerTeller[4]);
    }
    
    public void test5Achterstevoren()
    {
        String naam = "Hanzehogeschool";
        Woord woord = new Woord(naam);
        String omgekeerdeWoord = woord.geefWoordAchterstevoren();
        System.out.println(naam);
        System.out.println(omgekeerdeWoord);    // geeft "loohcsegoheznaH"
        
        String inputZin = geefZinTweeVanAdvies();
        Zin zin = new Zin(inputZin);
        String omgekeerdeZin = zin.geefZinAchterstevoren();
        System.out.println(zin.geefZin());
        System.out.println(omgekeerdeZin);      // geeft ".njiz nennuk nalp deog nee gniledfa-saaP nee tem lekniw ed nav " +
                                                        // "gnidierbtiu uoz teodroov diehnegeleg nee hciz re reennaW"
    }
    
    public void test6PrintInhoudsOpgaveAfstudeerVerslag()
    {
        Afstudeerverslag afstudeerVerslagKerstman = geefAfstudeerverslag();
        String inhoudsOpgave = afstudeerVerslagKerstman.geefInhoudsOpgave();
        System.out.println(inhoudsOpgave);
    }
    
    
    
    /* #######################################################################*/
    /* Hieronder staat code die input levert voor de tests, wijzig deze NIET! */
    private Afstudeerverslag geefAfstudeerverslag()
    {
        // het verslag als geheel
        String titelVerslag = "Kerst en ICT";
        Persoon auteurVerslag = new Persoon("Hendrik-Jan", "Kerstman, de", 1995, 6, 6, 185);
        Afstudeerverslag afstudeerVerslagKerstman = new Afstudeerverslag(titelVerslag, auteurVerslag); 

        // 1e hoofdstuk
        Hoofdstuk hoofdstuk1 = getHoofdstuk1(); 
        afstudeerVerslagKerstman.voegToeHoofdstuk(hoofdstuk1);
        
        // 2e hoofdstuk
        Hoofdstuk hoofdstuk2 = getHoofdstuk2(); 
        afstudeerVerslagKerstman.voegToeHoofdstuk(hoofdstuk2);
        
        // 3e hoofdstuk
        Hoofdstuk hoofdstuk3 = getHoofdstuk3();
        afstudeerVerslagKerstman.voegToeHoofdstuk(hoofdstuk3);
        
        return afstudeerVerslagKerstman;
    }
    
    private Hoofdstuk getHoofdstuk1()
    {
         // 1e hoofdstuk
        Hoofdstuk hoofdstuk1 = new Hoofdstuk("Inleiding");
        
        // paragraaf 1.1
        Paragraaf paragraafOpdracht = new Paragraaf("De Opdracht");
        paragraafOpdracht.voegToeZin("Dit verslag beschrijft een afstudeeropdracht voor HBO-ICT uitgevoerd bij kerstbomenkweker Hillenga in Hellum.");
        paragraafOpdracht.voegToeZin("De opdracht behelst het maken van een eenvoudige webwinkel om kerstspullen te verkopen.");
        paragraafOpdracht.voegToeZin("Het onderzoek moet gaan uitwijzen of een nieuw in te voeren Kerstmanjournaal op RTVNoord " +
            "bij zou kunnen gaan dragen aan de verkoop van de nieuwe winkel.");
        hoofdstuk1.voegToeParagraaf(paragraafOpdracht);
        
        // paragraaf 1.2
        Paragraaf paragraafBedrijf = new Paragraaf("Het Bedrijf");
        paragraafBedrijf.voegToeZin("Hillenga in Hellum is een qua omvang doorsnee kerstbomenkweker met een zeer ambitieuze nieuwe eigenaar.");
        paragraafBedrijf.voegToeZin("Ze hebben verkopen per jaar 15.000 kerstbomen met een gemiddelde prijs van 15 euro.");
        paragraafBedrijf.voegToeZin("De jaaromzet bedraagt dan ook 225.000 euro.");
        hoofdstuk1.voegToeParagraaf(paragraafBedrijf);
        
        return hoofdstuk1;
    }
    
    private Hoofdstuk getHoofdstuk2()
    {
        // 2e hoofdstuk
        Hoofdstuk hoofdstuk2 = new Hoofdstuk("Het Beroepsproduct");
        
        // paragraaf 2.1
        Paragraaf paragraafAnalyse = new Paragraaf("Analyse");
        paragraafAnalyse.voegToeZin("De analysefase van deze opdracht was beperkt en wordt hier verder niet toegelicht.");
        hoofdstuk2.voegToeParagraaf(paragraafAnalyse);
        
        // paragraaf 2.2
        Paragraaf paragraafTheorie = new Paragraaf("Theorie");
        paragraafTheorie.voegToeZin("Voor de theorie met betrekking tot Kerstmis, de Kerstman en dergelijke verwijs ik naar Sky Radio.");
        hoofdstuk2.voegToeParagraaf(paragraafTheorie);
        
        // paragraaf 2.3
        Paragraaf paragraafOntwerp = new Paragraaf("Ontwerp");
        paragraafOntwerp.voegToeZin("De opgeleverde webwinkel bestaat uit een frontend dat op iedere actuele browser werkt.");
        paragraafOntwerp.voegToeZin("Daarachter een IIS webserver met uiteraard een website geprogrammeeerd in C#.");
        paragraafOntwerp.voegToeZin("Daar weer achter een API, ook met Microsoft spullen gemaakt, die toegang geeft tot de SQL Server database.");
        hoofdstuk2.voegToeParagraaf(paragraafOntwerp);
        
        // paragraaf 2.4
        Paragraaf paragraafOnderzoek = new Paragraaf("Onderzoek");
        paragraafOnderzoek.voegToeZin("In het kader van het onderzoek zijn er een vijftal filmpjes gemaakt. Die zijn allen op YouTube te zien geweest.");
        paragraafOnderzoek.voegToeZin("Er is uit en te na geflyerd en geposterd om reclame te maken " +
                "voor de filmpjes en de daarin regelmatig genoemde nieuwe webwinkel.");
        paragraafOnderzoek.voegToeZin("Er zijn metingen van bezoekersaantallen gedaan en interviews met betalende en alleen maar bezoekende klanten gehouden.");
        paragraafOnderzoek.voegToeZin("Uit analyse van de verkregen gegevens bleek dat filmpjes veel aandacht scoren maar nauwelijks omzet opleveren.");
        paragraafOnderzoek.voegToeZin("De conclusie moet dan ook zijn dat Hillenga geen Kerstmanjournaal moet gaan maken of ondersteunen.");
        hoofdstuk2.voegToeParagraaf(paragraafOnderzoek);

        // paragraaf 2.5
        Paragraaf paragraafRealisatie = new Paragraaf("Realisatie");
        paragraafRealisatie.voegToeZin("Alles is overeenkomstig ontwerp, volgens planning en binnen de afgesproken tijd uitgevoerd.");
        paragraafRealisatie.voegToeZin("U kunt een en ander aan de hand van onderstaande architectuurplaatjes en screenshots bestuderen.");
        hoofdstuk2.voegToeParagraaf(paragraafRealisatie);
        
        return hoofdstuk2;
    }
    
    private Hoofdstuk getHoofdstuk3()
    {
        // 3e hoofdstuk
        Hoofdstuk hoofdstuk3 = new Hoofdstuk("Afsluiting");
        
        // paragraaf 3.1
        Paragraaf paragraafConclusie = new Paragraaf("Conclusie");
        paragraafConclusie.voegToeZin("Alles was, is en blijft OK. Alles sal reg kom.");
        hoofdstuk3.voegToeParagraaf(paragraafConclusie);
        
        // paragraaf 3.2
        Paragraaf paragraafAdvies = new Paragraaf("Advies");
        paragraafAdvies.voegToeZin("Uit het onderzoek bleek al dat het Kerstmanjournaal geen valide optie is.");
        String zinTweeVanAdvies = geefZinTweeVanAdvies();
        paragraafAdvies.voegToeZin(zinTweeVanAdvies);
        hoofdstuk3.voegToeParagraaf(paragraafAdvies);
        
        // paragraaf 3.3
        Paragraaf paragraafReflectie = new Paragraaf("Reflectie");
        paragraafReflectie.voegToeZin("Ik heb het goed gedaan.");
        hoofdstuk3.voegToeParagraaf(paragraafReflectie);
        
        return hoofdstuk3;
    }
    
    private String geefZinTweeVanAdvies()
    {
        return "Wanneer er zich een gelegenheid voordoet zou uitbreiding van de winkel met een Paas-afdeling een goed plan kunnen zijn.";
    }
}
