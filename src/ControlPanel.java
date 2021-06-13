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

            lab1 = new JLabel("ControlPanel");
            add(lab1);
        }
        catch(Exception err){
        	new UnknownException("Exception caught in class ControlPanel. In the constructor.\n", err);
        }
	}
}
	

