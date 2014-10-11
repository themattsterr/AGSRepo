package UserInterface;

import AGSMain.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author 
 */
public class MainWindow {
    private JFrame frame;
    private JMenuBar menuBar;
    private JPanel mainPane;

    private JMenu fileMenu;
    private JMenuItem exit;
    
    private JMenu aboutMenu;
    private JMenuItem aboutInfo;
    
    public MainWindow()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        BorderLayout layout = new BorderLayout();
        
        // Initialize the JFrame
        frame = new JFrame("Automatic Grading System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(layout);
        
        // Initialize the JMenuBar and add to the JFrame
        menuBar = new JMenuBar();
        frame.add(menuBar, BorderLayout.NORTH);
        
        // Initialize the File menu and add the JMenuItems with action listener
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        
        // Register the event handler      
        exit = new JMenuItem("Exit");
        exit.addActionListener(new FileMenuAction());
        
        fileMenu.add(exit);
        menuBar.add(fileMenu);
        
        // Initialize the About menu and add the JMenuItems with action listener
        aboutMenu = new JMenu("About");
        aboutMenu.setMnemonic('A');
        
        aboutInfo = new JMenuItem("About AGS");
        aboutInfo.addActionListener(new AboutMenuAction());

        aboutMenu.add(aboutInfo);
        menuBar.add(aboutMenu);
    
        // This is where the individual classes are populated
        mainPane = new JPanel();

        frame.setVisible(true);
        frame.validate();
        frame.repaint();
    }

    // Private inner class for event handling
    private class FileMenuAction implements ActionListener
    {
        // Process the object events
        public void actionPerformed(ActionEvent e)
        {
            // Remove any previous content
            mainPane.removeAll();

            // gets the text of the JMenuItem
            if (e.getActionCommand() == "Exit")
            {
                System.exit(0);
            }
        }    
    }               

    private class AboutMenuAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand() == "About AGS")
            {
                AboutInfo about = new AboutInfo(frame);
            }
        }    
    }        
}
