/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;


/**
 *
 * @author ddizoya
 */
public class Garaxe {

    private static int numeroCoches;
    private String matricula;
    private static final double PREZOINICIAL = 0.40;
    private double tiempo;
    private double ti;
    private double tf;
    private double prezo;
    private double prezodev;
    private double prezorec;

    public Garaxe() {

    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public double getTf() {
        return tf;
    }

    public void setTf(double tf) {
        this.tf = tf;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        Garaxe.numeroCoches = numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

 

    public void comprobarPlazas() {
        if (numeroCoches <= 5) {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES: " + (5 - numeroCoches));
            String mat;
            mat = JOptionPane.showInputDialog("Introduza a matrícula do seu coche:");
            numeroCoches++;
            this.matricula = mat;
            this.ti = System.currentTimeMillis();

        }

    }

    public void obterTf() {
        this.tf = System.currentTimeMillis();
    }

    public void calcularPrezo() {
        this.tiempo = this.getTf() - this.getTi();
        double calculo = (this.tiempo / 1000) - 3 + (Garaxe.PREZOINICIAL*3) * 0.20;
        JOptionPane.showMessageDialog(null, "O prezo é de " + calculo + "€.");
        this.prezo = calculo;
    }

    public void pagar() {

        double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce a cantidade(€), que vai introducir para pagar."));

        if (this.prezo > p) {
            JOptionPane.showMessageDialog(null, "Crédito insuficente.");
        } else {
            this.prezodev = this.prezo - p;
            this.prezorec = p;
        }

    }

    public void devolverNulos() {
        this.matricula = null;
        numeroCoches--;
    }

    public void factura() {
        JOptionPane.showMessageDialog(null, "****FACTURA****\n 1. MATRÍCULA: " + this.matricula + ""
                + "\n2. TEMPO: " + this.tiempo + "\n3. PERZO: " + this.prezo + "\n4. CARTOS RECIBIDOS: " + this.prezorec + "\n5."
                + " CARTOS DEVOLTOS: " + Math.abs(this.prezodev) + "\n\nGRAZAS POR EMPLEAR O NOSO APARCADOIRO.");
    }
}
