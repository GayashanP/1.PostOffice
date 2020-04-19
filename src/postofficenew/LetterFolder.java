package postofficenew;
import javax.swing.JOptionPane;
import java.util.Date;

public class LetterFolder 
{
    String body1;
    String senderAddress;
    String recieverAddress;
    String senderName;
    String recieverName;
    public void writing()
    {
      Date date = new Date();
      senderName = JOptionPane.showInputDialog("Enter sender's name");
      senderAddress = JOptionPane.showInputDialog("Enter sender's addres");
      recieverName = JOptionPane.showInputDialog("Enter reciever's name");
      recieverAddress = JOptionPane.showInputDialog("Enter reciever's addres");
      body1 = JOptionPane.showInputDialog("Write your letter in this sheet");
     
      StampFolder sending = new StampFolder();
      sending.StampForLetter();
      JOptionPane.showMessageDialog(null, senderName+"\n"+senderAddress+"\n\n"+recieverName+"\n"+recieverAddress+"\n\n\n"+body1+"\n\n\n\n"+date, "Finished letter", 1);
      JOptionPane.showMessageDialog(null,"Your letter will be sent tomorrow morning");
      JOptionPane.showMessageDialog(null,"It will be delivered about in 2 days");
      
      String again = JOptionPane.showInputDialog("Do you wish any other");
        if(again.equals("yes"))
        {
            Officer again2 = new Officer();
            again2.mission();
        }
        else if(again.equals("no"))
        {
            JOptionPane.showMessageDialog(null,"Thank You!, Have a nice day!");
        }
    }
}
