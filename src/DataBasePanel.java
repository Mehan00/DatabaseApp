import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//	#Klasa ktora obsluguje panel sterowania i komunikuje sie z
class DataBasePanel extends JPanel{
	
    private AppClass parentFrame;
	private JLabel lab1;
    private JTextArea textArea;

	
	public DataBasePanel(AppClass parentFrame) {
		try{
            setPreferredSize(new Dimension(500,300));

            
            textArea = new JTextArea ();
            textArea.setPreferredSize(new Dimension(400,280));   
            textArea.setLineWrap(true);
            textArea.setEditable(false);
            

            JScrollPane scroll = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            add(scroll);
            

        }
        catch(Exception err){
        	new UnknownException("Exception caught in class DatabasePanel. In the constructor.\n", err);
        }
	}
}
	

