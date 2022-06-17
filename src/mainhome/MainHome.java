/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainhome;

/**
 *
 * @author Fafoya
 */
public class MainHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Home home = new Home();
         java.awt.EventQueue.invokeLater(() -> {
             home.setVisible(true);
        });

    }
    
}
