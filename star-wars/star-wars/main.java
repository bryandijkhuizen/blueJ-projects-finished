import java.util.*;
/**
 * class main - geef hier een beschrijving van deze class
 *
 * @author Bryan Dijkhuizen
 * @version 1.12.2018
 */
public class main
{; 

    public void nameGenerator()
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("What is your first name? ");
       String firstName = sc.nextLine();
       firstName = firstName.substring(0, 2);
       
       
       System.out.print("What is your last name? ");
       String lastName = sc.nextLine();
       lastName = lastName.substring(0, 3);
       
       //Now the last Name
       
       System.out.print("What is your mother's maiden name? ");
       String mothers = sc.nextLine();
       mothers = mothers.substring(0, 2);
       
       
       System.out.print("What is your place of birth? ");
       String birthplace = sc.nextLine();
       birthplace = birthplace.substring(0, 3);
       
       String fullName = lastName + firstName + " " + mothers + birthplace;
       
       System.out.println("The name of your character would be: " + fullName);
       
       
    } 
    
    
    
    
       
    
    
    
}
