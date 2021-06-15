import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.*;
import java.awt.BorderLayout;

//	#Klasa ktora obsluguje panel sterowania i komunikuje sie z dataBasePanel
class ControlPanel extends JPanel{
	
    private AppClass parentFrame;
	private JButton addButton , delButton, modButton;
    private JLabel lab1;
    private JTextField productName, productPrice, productCount;
    private JPanel p = new JPanel();


	
	public ControlPanel(AppClass parentFrame) {
		try{
            setPreferredSize(new Dimension(500,150));

            addButton = new JButton("DODAJ");
            delButton = new JButton("USUŃ");
            modButton = new JButton("MODYFIKUJ");
          
            
            //textfield z nazwa produktu i funkcja do tak zwanego placeholer
            productName = new JTextField(10);
            productName.setForeground(Color.LIGHT_GRAY);
            productName.setText("Product Name");
            productName.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if(productName.getText().trim().equals("Product Name")) {
                        productName.setText("");
                        productName.setForeground(Color.BLACK);
                    }
                    
                    
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if(productName.getText().trim().equals("")) {
                        productName.setText("Product Name");
                        productName.setForeground(Color.LIGHT_GRAY);
                    }
                    
                   
                }
            });
            p.add(productName);

            //textfield z iloscia produktu i funkcja do tak zwanego placeholer
            productCount = new JTextField(10);
            productCount.setForeground(Color.LIGHT_GRAY);
            productCount.setText("Amount");
            productCount.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if(productCount.getText().trim().equals("Amount")) {
                        productCount.setText("");
                        productCount.setForeground(Color.BLACK);
                    }
                    
                   
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if(productCount.getText().trim().equals("")) {
                        productCount.setText("Amount");
                        productCount.setForeground(Color.LIGHT_GRAY);
                    }
                    
                    
                }
            });
            p.add(productCount);

            //textfield z cena produktu i funkcja do tak zwanego placeholer
            productPrice = new JTextField(10);
            productPrice.setForeground(Color.LIGHT_GRAY);
            productPrice.setText("Price");
            productPrice.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if(productPrice.getText().trim().equals("Price")) {
                        productPrice.setText("");
                        productPrice.setForeground(Color.BLACK);
                    }
                    
                   
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if(productPrice.getText().trim().equals("")) {
                        productPrice.setText("Price");
                        productPrice.setForeground(Color.LIGHT_GRAY);
                    }
                    
                    
                }
            });
            p.add(productPrice);

            add(p,BorderLayout.NORTH);

            p.add(addButton);
            add(delButton);
            add(modButton);

        }
        catch(Exception err){
        	new UnknownException("Exception caught in class ControlPanel. In the constructor.\n", err);
        }
	}
}
	

