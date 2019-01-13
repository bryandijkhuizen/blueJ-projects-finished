import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.1
 */
public class ImageViewer implements ActionListener
{
	private JFrame frame;
	
	public void actionPerformed(ActionEvent event) {
		System.out.println("Menu item: " + event.getActionCommand());
		
	}
	
	private void makeFrame()
    {
        frame = new JFrame("ImageViewer");        
        Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("I am a label.");
        contentPane.add(label);

        frame.pack();
        frame.setVisible(true);
    }
	
	 private void makeMenuBar(JFrame frame) {
	    	JMenuBar menubar = new JMenuBar();
	        frame.setJMenuBar(menubar);
	        
	        JMenu fileMenu = new JMenu("File");
	        menubar.add(fileMenu);
	        
	        JMenu openItem = new JMenu("Open");
	        openItem.addActionListener(this);
	        menubar.add(openItem);
	        
	        JMenu quitItem = new JMenu("Quit");
	        quitItem.addActionListener(this);
	        menubar.add(quitItem);
	    }

    public ImageViewer() {
        makeFrame();
    }
    
   
    
   

    
}
