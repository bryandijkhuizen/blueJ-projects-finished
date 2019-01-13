import java.util.*;

/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class LabClass
{
    private String room;
    private String timeAndDay;
    private ArrayList<Persoon> studenten;
    private ArrayList<Persoon> docenten;
    private int capacity;
    
    public static void main(String args[]) {
    	
    }
    
    
    /**
     * Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public LabClass(int maxNumberOfStudents)
    {
        room = "unknown";
        timeAndDay = "unknown";
        studenten = new ArrayList<Persoon>();
        docenten = new ArrayList<Persoon>();
        capacity = maxNumberOfStudents;
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Persoon newStudent)
    {
        if(studenten.size() == capacity) {
            System.out.println("The class is full, you cannot enrol.");
        }
        else {
            studenten.add(newStudent);
        }
    }
    
    public void enrollDocenten(Persoon newDocent)
    {
        if(docenten.size() >1) {
            System.out.println("1 Docent per klas!");
        }
        else {
            docenten.add(newDocent);
        }
    }

    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return studenten.size();
    }
    
    /**
     * Set the room number for this LabClass.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the time for this LabClass. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    public void classInfo() {
    	System.out.println("Het Maximaal aantal leerlingen in deze klas: " + capacity);
        System.out.println("Het lokaal: " + room);
        System.out.println("Het aantal studenten: " + numberOfStudents());
        
        System.out.println("De Docent: ");
    	for(int i=0;i<docenten.size();i++){
    	    System.out.println(docenten.get(i).vollNaam);
    	}
    	
    	System.out.println("De Studenten: ");
    	for(int i=0;i<studenten.size();i++){
    	    System.out.println(studenten.get(i).vollNaam);
    	}
    }

        
    
}
