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
        Garaxe gx1 = new Garaxe();
        Garaxe gx2 = new Garaxe();
        Garaxe gx3 = new Garaxe();
        Garaxe gx4 = new Garaxe();
        Garaxe gx5 = new Garaxe();
        Garaxe aux = new Garaxe();
        int menu;
        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, " ***MENU***\nSe quere deixar o seu coche no garaxe, prema 1."
                + "\nSe quere retirar o seu coche, prema 2.\nSe preme 0 o programa deixarase de executar."));

        switch (menu) {

            case 1:
                if (aux.getNumeroCoches()<5){
                if(gx1.getMatricula()==null)
                    gx1.comprobarPlazas();
                else if (gx2.getMatricula()==null)
                    gx2.comprobarPlazas();
                else if (gx3.getMatricula()==null)
                    gx3.comprobarPlazas();
                else if (gx4.getMatricula()==null)
                    gx4.comprobarPlazas();
                else if (gx5.getMatricula()==null)
                    gx5.comprobarPlazas();
                }else
                    JOptionPane.showMessageDialog(null, "NON HAY PLAZAS LIBRES.");
                break;

            case 2:
                String ma = JOptionPane.showInputDialog("Introduce o número de matrícula do seu coche");
                Date fecha = new Date();
                if (ma.equals(gx1.getMatricula())) {
                    gx1.obterTf();
                    gx1.calcularPrezo();
                    gx1.pagar();
                    gx1.factura();
                    gx1.devolverNulos();
                    
                } else if (ma.equals(gx2.getMatricula())) {
                    gx2.obterTf();
                    gx2.calcularPrezo();
                    gx2.pagar();
                    gx2.factura();
                    gx2.devolverNulos();
                } else if (ma.equals(gx3.getMatricula())){
                    gx3.obterTf();
                    gx3.calcularPrezo();
                    gx3.pagar();
                    gx3.factura();
                    gx3.devolverNulos();
                } else if (ma.equals(gx4.getMatricula())){
                    gx4.obterTf();
                    gx4.calcularPrezo();
                    gx4.pagar();
                    gx4.factura();
                    gx4.devolverNulos();
                } else if (ma.equals(gx5.getMatricula())) {
                    gx5.obterTf();
                    gx5.calcularPrezo();
                    gx5.pagar();
                    gx5.factura();
                    gx5.devolverNulos();
                } else {
                        JOptionPane.showMessageDialog(null, "MATRÍCULA NON ATOPADA.");
                        }
                break;
            
            default:
                JOptionPane.showConfirmDialog(null, "Cometeu un erro, ou cerrou o programa. Inténteo de novo ou máis tarde. Disculpe as molestias.");
                
            } 
        } while (menu!=0);

    }

}
