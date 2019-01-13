import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.2
 */
public class ImageViewer implements ActionListener
    
{
    private JFrame frame;
    
    /**d
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }

    /**
     * Receive notification of an action.
     * @param event Details of the action.
     */
    public void actionPerformed(ActionEvent event) 
    { 
        System.out.println("Menu item: " + event.getActionCommand());
    }

    
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        makeMenuBar(frame);
        
        Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        contentPane.add(label);

        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(event -> openFile());
        fileMenu.add(openItem);
        
        JMenuItem saveFile = new JMenuItem("Save");
        saveFile.addActionListener(event -> saveFile());
        fileMenu.add(saveFile);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(event -> quit());
        fileMenu.add(quitItem);
        
        JMenuItem helpItem = new JMenuItem("Help");
        helpItem.addActionListener(event -> help());
        menubar.add(helpItem);
    
    }

    
    private void openFile()
    {
        System.out.println("open file");
    }
    
    private void saveFile() {
    	System.out.println("save file");
    }
    
    private void help() {
    	System.out.println("help!");
    }
    
    private void quit() {
    	System.exit(0);
    }
}
