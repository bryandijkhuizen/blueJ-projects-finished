import java.util.*;

/**
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 *
 * @author  Bryan Dijkhuizen
 * @version 04.12.2018
 */

public class Game
{
    private Parser parser;
    private Room currentRoom;
    private Stack<Room> roomHistory; //Here's the stack defined
    private Room previousRoom;
    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
        createRooms();
        parser = new Parser();
        roomHistory = new Stack<>(); //Stack is created
    }
    

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office, cellar, garden, highway;

        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        cellar = new Room("in the cellar");
        garden = new Room("in the magnificent garden" );
        highway = new Room("on this dangerous highway" );

        // initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("north", garden);

        theater.setExit("west", outside);
        garden.setExit("north", highway);
        garden.setExit("south", outside);

        highway.setExit("south", garden);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);
        office.setExit("down", cellar);

        cellar.setExit("up", office);
        
        previousRoom = outside;
        currentRoom = outside;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + currentRoom.getShortDescription());
        System.out.print(currentRoom.getExitString());
        System.out.println();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("look")){
            look() ;
        }
         else if (commandWord.equals("splash")) {
            splash();
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        else if (commandWord.equals("back")) {
            goBack();
        }

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:" + parser.showCommands());

    }
    

    /**
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null ) {
            System.out.println("There is no door!");
        }
        else {
           
            roomHistory.push(currentRoom); //current room will be added to this stack
            currentRoom = nextRoom;
              
            } 
                
    }

                /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command)     {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    private void look()
    {
        System.out.println(currentRoom.getLongDescription());

    }
    
    private void splash()
    {
        System.out.println("It's not very effective....");
    }
    /** Sends player back to previous room
     * gives an error when you enter 'back back'
     */
    private void goBack()
    {
        if (roomHistory.empty()) // check if stack is empty
        {   System.out.println("You cannot go further back than the starting position.");
      } else { //if stack contains objects
            currentRoom = roomHistory.pop(); //remove the last added object and return that
            System.out.println(currentRoom.getLongDescription()); //print out your current room description
        }
    }
}
