package airesearch;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
/*@author Hatem Mohamed*/
public class Bootstrap {
       public void run(){
         jade.core.Runtime runtime=jade.core.Runtime.instance();
         Profile profile=new ProfileImpl();
         profile.setParameter(profile.PLATFORM_ID,"AI-Research");
         profile.setParameter(Profile.MAIN_HOST, "127.0.0.1");
         profile.setParameter(Profile.MAIN_PORT, "1111");
         ContainerController MainContainer=runtime.createMainContainer(profile);
         try{
             AgentController GUI=MainContainer.createNewAgent("GUI","jade.tools.rma.rma",null);
             GUI.start();
         }catch(Exception e){
             System.out.println("Error is "+e.getMessage());
         }   
    }
}
