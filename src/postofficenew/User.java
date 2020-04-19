package postofficenew;
import javax.swing.JOptionPane;



public class User {
    public String name;
    String ageStr;
    int age;
    String idNumberStr;
    
    public void initializing()
    {
        name = JOptionPane.showInputDialog("Whats your name sir !");
        ageStr = JOptionPane.showInputDialog("How old are you sir ! ");
        age = Integer.parseInt(ageStr);
        idNumberStr = JOptionPane.showInputDialog("Whats your ID number ");
        Officer enteringOffice = new Officer();
        enteringOffice.mission();
        
        
    }

    
    
}
