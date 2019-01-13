
/**
 * class EventPost - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class EventPost extends Post
{
    
    private String event;
    
    public EventPost(String author, String text)
    {
        super(author);
        event = text;
       
    }
    
    public String getEvent()
    {
        return event;
    }
    
    public String PrintShortSummary(){
        return "Event post from: " + getUserName();
    }
    
    public void display() {
    	super.display();
    	System.out.println(event);
    }
    
    
    
    

}
