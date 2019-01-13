import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version version = 0.2
 */
public class MessagePost extends Post
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * r
     * @param author    The username of the author of this post.
     * @param text      The text of 4this post.
     */
    public MessagePost(String author, String text)
    {
        
        super(author);
        message = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }
    
    public String PrintShortSummary(){
        return "Message post from: " + getUserName();
    }
    
    public String toString() {
    	System.out.println(message);
    	return super.toString() +  "\n";
    }
    
    public void display() {
    	super.display();
    	System.out.println(toString());
    }
}
