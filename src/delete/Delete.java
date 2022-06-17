/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delete;

/**
 *
 * @author Fafoya
 */
public class Delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        delete1 delete1 = new delete1();
        delete1.LoadMenu();
         java.awt.EventQueue.invokeLater(() -> {
             delete1.setVisible(true);
        });
        
    }
    
}
