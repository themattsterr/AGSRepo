package UserInterface;

import javax.swing.*;

public class AboutInfo {
    
    public AboutInfo(JFrame parent)
    {
        initComponents(parent);
    }
    
    private void initComponents(JFrame parent)
    {
        JOptionPane.showMessageDialog(parent
        		, "Automatic Grading System\nSenior Design Fall 2014\nAuthors:\nWilliam Adkins\nRodney Jonace\nMatt Rouse"
        		, "About"
        		, JOptionPane.INFORMATION_MESSAGE);
    }    
}
