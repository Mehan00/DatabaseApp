import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//	#Klasa ktora obsluguje panel sterowania i komunikuje sie z
class ControlPanel extends JPanel{
	
    private AppClass parentFrame;
	private JButton addButton , delButton, modButton;
    private JLabel lab1;

	
	public ControlPanel(AppClass parentFrame) {
		try{
            setPreferredSize(new Dimension(500,50));

            addButton = new JButton("DODAJ");
            delButton = new JButton("USUŃ");
            modButton = new JButton("MODYFIKUJ");
            add(addButton);
            add(delButton);
            add(modButton);

        }
        catch(Exception err){
        	new UnknownException("Exception caught in class ControlPanel. In the constructor.\n", err);
        }
	}
}
	

