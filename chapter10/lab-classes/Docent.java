/**
 * The CopyOfStudent class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Docent extends Persoon

{
    private String afkorting;
    private String persoonlijkLokaal;
    private String name;

    /**
     * Create a new student with a given name and ID number.
     */
    
    public Docent(String naam){
        super(naam);
        if(naam.length() < 4){
               System.out.println("De naam heeft te weinig tekens");
            }
            
            name = naam;
}
   

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String afkorting()
    {
        return afkorting;
    }


    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String setAfkorting()
    {
        int nameLength = 4;
        int realNameLength = name.length();
        
        if(realNameLength <= 4) {
         nameLength = realNameLength;
        }
        
        afkorting = name.substring(0,4).toUpperCase(); 
        return afkorting; 
        
    }
    
    public void setPersoonlijkLokaal(String lokaal){
        persoonlijkLokaal = lokaal;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + "(" + afkorting + ")");
    }
}
