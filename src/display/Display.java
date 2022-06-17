/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

/**
 *
 * @author Fafoya
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         display1 des = new display1();
         java.awt.EventQueue.invokeLater(() -> {
             des.setVisible(true);
        });
    }
    
}
