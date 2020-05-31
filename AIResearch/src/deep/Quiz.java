package quiz;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Quiz {

    
    public static void main(String[] args) { 
    Quiz t=new Quiz();
    t.jade();
    
    }
    
    
    public void  jade (){
    jade.core.Runtime run =jade.core.Runtime.instance();
            Profile p = new ProfileImpl("localhost", 5000 , "ahmed ");
            ContainerController c =run.createMainContainer(p);
    try { 
        AgentController a =c.createNewAgent("aaa", "jade.tools.rma.rma", null) ;
        a.start();
    } catch (StaleProxyException ex) {
        Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
    
            
    }
    
    }
}

  
