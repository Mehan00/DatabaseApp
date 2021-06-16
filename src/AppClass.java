import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;

public class AppClass extends JFrame {
    List<List<String>> Itemlist =  new ArrayList<List<String>>();
    
    private ControlPanel controlPanel;
    

	public AppClass(String title) {
        
    	super(title);
        
    	
        try {
        	Toolkit tk=Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            setSize(700,520);
            setLocation(100, 100);
            setResizable(false);
            
            controlPanel=new ControlPanel(this);
           

            add(controlPanel,BorderLayout.NORTH);
    		controlPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
           
    		pack();
          
        }
        catch(Exception err){
        	new UnknownException("Exception caught in class AppClass. In the constructor.\n", err);
        }
    }

   
	
}
