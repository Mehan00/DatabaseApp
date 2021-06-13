import java.awt.EventQueue;
import javax.swing.JFrame;

//	Okno glowne programu
public class MainClass {
    public static void main(String[] args){

        EventQueue.invokeLater(() -> {
        	
        	AppClass app =new AppClass("Strona główna");
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            app.setVisible(true);
        	
        	
        });
    } 
}

