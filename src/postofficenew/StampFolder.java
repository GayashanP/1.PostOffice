package postofficenew;
import javax.swing.JOptionPane;

public class StampFolder {
   
    int stampsCount[]= {100,100,100,100};
    public void buyingStamps()
    {
        //Stamps in the post office
        int s5=0,s10=0,s15=0,s20=0;
        
        
        String countStr = JOptionPane.showInputDialog(null,"We have 5,10,15,20 fee stamps, how much money do you wish to buy");
        int count = Integer.parseInt(countStr);
        int stampFee=count;
        while(count>=20)
        {
            s20++;
            stampsCount[3]-=1;
            count-=20;
        }
        if(count==15)
        {
            s15++;
            stampsCount[2]-=1;
            count-=15;
        }
        if(count==10)
        {
            s10++;
            stampsCount[1]-=1;
            count-=10;
        }
        if(count==5)
        {
            s5++;
            stampsCount[0]-=1;
        }
        String money1 = JOptionPane.showInputDialog("Pay for these");
        int moneyPay = Integer.parseInt(money1);
        if(moneyPay<stampFee)
        {
            JOptionPane.showMessageDialog(null,"You havent enough money for paying./n Try Again!");
            buyingStamps();
        }
        JOptionPane.showMessageDialog(null,"Take this Shit :-D "+(moneyPay-stampFee));
        JOptionPane.showMessageDialog(null,"you got \n5$-"+s5+"\n10$-"+s10+"\n15$-"+s15+"\n20$-"+s20+"\nstamps");
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
    public void StampForLetter()
    {
        String distance = JOptionPane.showInputDialog("Do you wish to send this letter to outside of the country");
        if(distance.equals("yes"))
        {
            JOptionPane.showMessageDialog(null,"Buy stamps of Rs.500");
        }
        else if(distance.equals("no"))
        {
            JOptionPane.showMessageDialog(null,"Buy stamps of Rs.10");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid input. fool!");
            StampForLetter();
        }
        
    }
    
}
