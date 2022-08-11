/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

/**
 *
 * @author Fafoya
 */
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Add1 ad = new Add1();
         java.awt.EventQueue.invokeLater(() -> {
             ad.setVisible(true);
        });
    }
    
}
