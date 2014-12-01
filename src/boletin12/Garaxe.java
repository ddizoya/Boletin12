/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author ddizoya
 */
public class Garaxe {

    private int numeroCoches;
    private String matricula1;
    private String matricula2;
    private String matricula3;
    private String matricula4;
    private String matricula5;
    private static double PREZOINICIAL = 0.40;
    private long Ti1;
    private long Tf1;
    private long Ti2;
    private long Tf2;
    private long Ti3;
    private long Tf3;
    private long Ti4;
    private long Tf4;
    private long Ti5;
    private long Tf5;

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula1() {
        return matricula1;
    }

    public void setMatricula1(String matricula1) {
        this.matricula1 = matricula1;
    }

    public String getMatricula2() {
        return matricula2;
    }

    public void setMatricula2(String matricula2) {
        this.matricula2 = matricula2;
    }

    public String getMatricula3() {
        return matricula3;
    }

    public void setMatricula3(String matricula3) {
        this.matricula3 = matricula3;
    }

    public String getMatricula4() {
        return matricula4;
    }

    public void setMatricula4(String matricula4) {
        this.matricula4 = matricula4;
    }

    public String getMatricula5() {
        return matricula5;
    }

    public void setMatricula5(String matricula5) {
        this.matricula5 = matricula5;
    }

    public static double getPREZOINICIAL() {
        return PREZOINICIAL;
    }

    public static void setPREZOINICIAL(double PREZOINICIAL) {
        Garaxe.PREZOINICIAL = PREZOINICIAL;
    }

    public long getTi1() {
        return Ti1;
    }

    public void setTi1(long Ti1) {
        this.Ti1 = Ti1;
    }

    public long getTf1() {
        return Tf1;
    }

    public void setTf1(long Tf1) {
        this.Tf1 = Tf1;
    }

    public long getTi2() {
        return Ti2;
    }

    public void setTi2(long Ti2) {
        this.Ti2 = Ti2;
    }

    public long getTf2() {
        return Tf2;
    }

    public void setTf2(long Tf2) {
        this.Tf2 = Tf2;
    }

    public long getTi3() {
        return Ti3;
    }

    public void setTi3(long Ti3) {
        this.Ti3 = Ti3;
    }

    public long getTf3() {
        return Tf3;
    }

    public void setTf3(long Tf3) {
        this.Tf3 = Tf3;
    }

    public long getTi4() {
        return Ti4;
    }

    public void setTi4(long Ti4) {
        this.Ti4 = Ti4;
    }

    public long getTf4() {
        return Tf4;
    }

    public void setTf4(long Tf4) {
        this.Tf4 = Tf4;
    }

    public long getTi5() {
        return Ti5;
    }

    public void setTi5(long Ti5) {
        this.Ti5 = Ti5;
    }

    public long getTf5() {
        return Tf5;
    }

    public void setTf5(long Tf5) {
        this.Tf5 = Tf5;
    }

    public void comprobarPlazas() {
        if (numeroCoches <= 5) {
            JOptionPane.showMessageDialog(null, "COMPLETO");
        } else {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES:" + (5 - numeroCoches));
            String mat;
            mat = JOptionPane.showInputDialog("Introduza a matrícula do seu coche:");
            Date fecha = new Date();
            if (matricula1 == null) {
                this.matricula1 = mat;
                this.Ti1 = fecha.getTime();
            } else if (matricula2 == null) {
                this.matricula2 = mat;
                this.Ti2 = fecha.getTime();
            } else if (matricula3 == null) {
                this.matricula3 = mat;
                this.Ti3 = fecha.getTime();
            } else if (matricula4 == null) {
                this.matricula4 = mat;
                this.Ti4 = fecha.getTime();
            } else {
                this.matricula5 = mat;
                this.Ti5 = fecha.getTime();
            }
            this.numeroCoches = numeroCoches++;
            
        }

    }

    public public double calcularPrezo() {
    
    }
}
