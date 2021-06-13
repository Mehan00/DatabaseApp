import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;

public class AppClass extends JFrame {
    private ControlPanel controlPanel;
    private DataBasePanel databasepanel;

	public AppClass(String title) {
        
    	super(title);
    	
        try {
        	Toolkit tk=Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            setSize(700,520);
            setLocation(100, 100);
            setResizable(false);
            
            controlPanel=new ControlPanel(this);
            databasepanel=new DataBasePanel(this);

            add(controlPanel,BorderLayout.NORTH);
            add(databasepanel,BorderLayout.SOUTH);
    		controlPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
            databasepanel.setBorder(new BevelBorder(BevelBorder.RAISED));
    		pack();
          
        }
        catch(Exception err){
        	new UnknownException("Exception caught in class AppClass. In the constructor.\n", err);
        }
    }

	
}
