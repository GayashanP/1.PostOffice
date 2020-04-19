package postofficenew;
import javax.swing.JOptionPane;


public class Officer {
    
    String name= "Fernando";
    int age = 40;
    int idNumber = 69696969;
    
    public  void mission()
    {
        JOptionPane.showMessageDialog(null,"I'm the officer here, Mr."+name);
        String mission1 = JOptionPane.showInputDialog("How can we help you sir! ");
        switch (mission1) {
            case "send a letter":
                LetterFolder writingLetter = new LetterFolder();
                writingLetter.writing();
                break;
            case "buy stamps":
                StampFolder buyStamp = new StampFolder();
                buyStamp.buyingStamps();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error input.Try again");
                mission();
                break;
        }
    }
    
}
