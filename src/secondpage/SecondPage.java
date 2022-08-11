/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpage;

/**
 *
 * @author Fafoya
 */
public class SecondPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          page1 page = new page1();
         java.awt.EventQueue.invokeLater(() -> {
             page.setVisible(true);
        });
    }
    
}
