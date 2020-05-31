package airesearch;
import jade.core.Agent;
/*@author Hatem Mohamed*/
public class SellerAgent extends Agent{
     @Override
    protected void setup(){
        SellerGui gui=new SellerGui(getAID().getLocalName(),getAID().getName());
         addBehaviour(new SellingBehaviour());
    }  
    protected void takeDown(){
            System.out.println(getAID().getName()+" Killed Successfullt");
    }
}
