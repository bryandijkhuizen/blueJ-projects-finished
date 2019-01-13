/**
 * The CopyOfStudent class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Student extends Persoon

{
    private String id;
    private int credits;
    private String name;

    /**
     * Create a new student with a given name and ID number.
     */
    
    public Student(String naam, String studentID){        
        
        super(naam);
        
        if(naam.length() < 4){
               System.out.println("De naam heeft te weinig tekens");
            }
        if(studentID.length() < 3){
                System.out.println("Het id heeft te weinig tekens");
            }
            
            name = naam;
            id = studentID;
            credits = 0;
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
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        int nameLength = 4;
        int idLength = 3;
        int realNameLength = name.length();
        int realIdLength = id.length();
        
        if(realNameLength <= 4) {
         nameLength = realNameLength;
        }
        
        if(realIdLength <= 3){
         idLength = realIdLength;   
        }
        
        return name.substring(0,nameLength) + id.substring(0,idLength);
        
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
