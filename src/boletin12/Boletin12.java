/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaxe gx = new Garaxe();
        
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, " ***MENU***\nSe quere deixar o seu coche no garaxe, prema 1."
                + "\n Se quere retirar o seu coche, prema 2."));

        switch (menu) {
    
            case 1:
                gx.comprobarPlazas();    
            
            case 2:
                String ma = JOptionPane.showInputDialog("Introduce o número de matrícula do seu coche");
                Date fecha = new Date();
                if (ma.equals(gx.getMatricula1())){
                    gx.setTf1(fecha.getTime());
                    doublegx.getTf1()-gx.getTi1();
                } else if (ma.equals(gx.getMatricula2())){
                    
                }
            default:
                JOptionPane.showConfirmDialog(null, "Cometeu un erro.");

        }

    }

}
