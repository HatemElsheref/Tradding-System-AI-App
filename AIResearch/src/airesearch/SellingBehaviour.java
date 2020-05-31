package airesearch;
import jade.core.behaviours.Behaviour;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;
/*@author Hatem Mohamed*/
public class SellingBehaviour  extends Behaviour{
    @Override
    public void action(){
       ACLMessage receiver=this.getAgent().receive();
        if (receiver != null) {
           String output="****************Order**********************\n";
                  output+="The Seller : "+this.getAgent().getAID().getName()+"\n";
                  output+="The Buyer : "+receiver.getSender().getName()+"\n";
                  output+="The Order Is : "+receiver.getContent()+"\n";
                  output+="The Buyer : "+receiver.getSender().getName()+" buy the book successfully\n";
                  output+="****************Order**********************\n";
                  JOptionPane.showMessageDialog(null,output);
        }
    }
    @Override
    public boolean done(){
        return false;
    }
}
