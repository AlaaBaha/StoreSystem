/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author Fafoya
 */
public class Bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         bill1 bil = new bill1();
         java.awt.EventQueue.invokeLater(() -> {
             bil.setVisible(true);
        });
    }
    
}
