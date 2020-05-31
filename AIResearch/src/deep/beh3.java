/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deep;

import jade.core.behaviours.Behaviour;
import javax.swing.JOptionPane;

/**
 *
 * @author allam911
 */
public class beh3 extends Behaviour {

    @Override
    public void action() {
       String x=JOptionPane.showInputDialog("enter num 1");
       int num1=Integer.parseInt(x);
        
       String y=JOptionPane.showInputDialog("enter num 2");
       int num2=Integer.parseInt(x);       
       int sub=num1-num2;
        System.out.println(sub);
    }

    @Override
    public boolean done() {
         return true;
    }
    
}
