import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.*;
import java.awt.BorderLayout;

//	#Klasa ktora obsluguje panel sterowania i komunikuje sie z dataBasePanel
class ControlPanel extends JPanel{
    
    Map<Integer, List<String>> ItemList = new HashMap<>();
    
    private AppClass parentFrame;
	private JButton addButton , clearButton, showButton;
    private JLabel lab1;
    private JTextField productName, productPrice, productCount;
    private JPanel p = new JPanel();
    private JTextArea textArea;
    private Integer i = 0;
	
	public ControlPanel(AppClass parentFrame) {
		try{
            setPreferredSize(new Dimension(500,450));
            lab1 = new JLabel();

            addButton = new JButton("DODAJ");
            clearButton = new JButton("WYCZYŚĆ");
            showButton = new JButton("POKAŻ");
          
            
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
            p.add(clearButton);
            add(showButton);
            add(lab1);

            textArea = new JTextArea (20,40);
           
            textArea.setLineWrap(true);
            textArea.setEditable(false);
            textArea.setWrapStyleWord(true);
            JScrollPane scroll = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            add(scroll);

           
            addButton.addActionListener (e -> {
                try {
                    List<String> Item = new ArrayList<>();
                    
                    
                    Item.add(productName.getText());
                    Item.add(productCount.getText());
                    Item.add(productPrice.getText());
                    ItemList.put(i,Item);
                    i++;
                    System.out.println(Item);                  
                }
                catch (Exception err) {
                    JOptionPane.showMessageDialog(parentFrame, "Niepoprawne dane w polach tekstowych.");
                }
                
            });

            clearButton.addActionListener (e -> {
                try {
                    productName.setForeground(Color.LIGHT_GRAY);
                    productName.setText("Product Name");
                    productCount.setForeground(Color.LIGHT_GRAY);
                    productCount.setText("Amount");
                    productPrice.setForeground(Color.LIGHT_GRAY);
                    productPrice.setText("Price");
                                    
                }
                catch (Exception err) {
                    JOptionPane.showMessageDialog(parentFrame, "Error in cleearButton");
                }
            
            });
            showButton.addActionListener (e -> {
                try {


                    textArea.setText("");
                    Set<Map.Entry<Integer, List<String>>> entries = ItemList.entrySet();
                    Iterator<Map.Entry<Integer, List<String>>> itemIterator = entries.iterator();

                    while(itemIterator.hasNext()) {
                        Map.Entry<Integer, List<String>> entry = itemIterator.next();
                        textArea.append(entry.getKey()+" "+entry.getValue()+"\n");
                    }          
                }
                catch (Exception err) {
                    JOptionPane.showMessageDialog(parentFrame, "Error in modButton");
                }
        
    });

        }
        catch(Exception err){
        	new UnknownException("Exception caught in class ControlPanel. In the constructor.\n", err);
        }
	}
}
	

