package airesearch;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.util.LinkedList;
/*@author Hatem Mohamed*/
public class BuyingBehaviour extends Behaviour{
    private String bookname;
    LinkedList<Book> list=new LinkedList<Book>();
   public  Book  Best_Book;
   public Agent context;
    public BuyingBehaviour(Agent agent,String bookname){
        this.bookname=bookname;
        this.context=agent;
    }
    @Override
    public void action() {
        for (int i = 0; i < BookStore.store.size(); i++) {
             if(BookStore.store.get(i).getName().equals(this.bookname)){
                 list.add(BookStore.store.get(i));
             }
        }
        this.Best_Book=this.list.getFirst();
        for (int i = 0; i < this.list.size(); i++) {
             if(this.list.get(i).getPrice()<= this.Best_Book.getPrice()){
                  this.Best_Book=this.list.get(i);
             }
        }
            ACLMessage sender=new ACLMessage(ACLMessage.REQUEST);
            sender.addReceiver(new AID(this.Best_Book.GloalName,AID.ISGUID));
            sender.setContent("buying "+this.Best_Book.getName()+" BOOK With Price "+this.Best_Book.getPrice()+"$ now ....");
           
            context.send(sender);
    }
    @Override
    public boolean done(){
        return true;
    }
}
