/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modify;

/**
 *
 * @author Fafoya
 */
public class Modify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        modify1 modify = new modify1();
       
         java.awt.EventQueue.invokeLater(() -> {
             modify.setVisible(true);
        });
    }
    
}
