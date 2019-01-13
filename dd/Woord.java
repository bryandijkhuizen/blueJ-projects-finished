import java.lang.reflect.Array;
public class Woord
{
    private String tekenrij;

    public Woord(String tekenrij)
    {
        this.tekenrij = tekenrij;
    }
    
    public int geefAantalTekens()
    {
        // Zet hier je code t.b.v. opgave 3!
        return this.tekenrij.length();
    }
    
    public String geefWoordAchterstevoren()
    {
        // Zet hier je code t.b.v. opgave 5!
        String achterstevoren = "";
        for(int i = this.tekenrij.length() - 1; i >= 0; i--) {
            achterstevoren += this.tekenrij.charAt(i);
        }
        return achterstevoren;
    }
    
    public String geefWoord()
    {
        return tekenrij;
    }
    
    public int[] telKlinkers()
    {
        // Zet hier je code t.b.v. opgave 4!
        int[] klinkers = new int[5];
        boolean searching = true;
        
        while(searching) {
            if(this.tekenrij.indexOf("a") != -1) {
                this.tekenrij = this.tekenrij.replaceFirst("a", "");
                klinkers[0] += 1;
            } else if(this.tekenrij.indexOf("e") != -1) {
                this.tekenrij = this.tekenrij.replaceFirst("e", "");
                klinkers[1] += 1;
            } else if(this.tekenrij.indexOf("i") != -1) {
                this.tekenrij = this.tekenrij.replaceFirst("i", "");
                klinkers[2] += 1;
            } else if(this.tekenrij.indexOf("o") != -1) {
                this.tekenrij = this.tekenrij.replaceFirst("o", "");
                klinkers[3] += 1;
            } else if(this.tekenrij.indexOf("u") != -1) {
                this.tekenrij = this.tekenrij.replaceFirst("u", "");
                klinkers[4] += 1;
            } else {
                searching = false;
            }
        }
        return klinkers;
    }
}
