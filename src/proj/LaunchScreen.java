/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author johnson3yo
 */
public class LaunchScreen {
    
    public static void main(String[] args) {
        
        try {
            new MainScr(new JFrame(), true).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LaunchScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
