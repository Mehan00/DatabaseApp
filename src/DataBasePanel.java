import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//	#Klasa ktora obsluguje panel sterowania i komunikuje sie z
class DataBasePanel extends JPanel{
	
    private AppClass parentFrame;
	private JLabel lab1;

	
	public DataBasePanel(AppClass parentFrame) {
		try{
            setPreferredSize(new Dimension(500,300));

            lab1 = new JLabel("DatabasePanel");
            add(lab1);
        }
        catch(Exception err){
        	new UnknownException("Exception caught in class DatabasePanel. In the constructor.\n", err);
        }
	}
}
	

