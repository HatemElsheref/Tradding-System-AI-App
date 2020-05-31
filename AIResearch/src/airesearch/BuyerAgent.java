package airesearch;
import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/*@author Hatem Mohamed*/
public class BuyerAgent extends Agent{
    public String bookname;
    @Override
        protected void setup(){
            this.bookname=JOptionPane.showInputDialog("Enter The Book Name ?");
            addBehaviour(new BuyingBehaviour(this,this.bookname));
        }
    protected void takeDown(){
            System.out.println("Agent Killed Successfullt");
    }
}
