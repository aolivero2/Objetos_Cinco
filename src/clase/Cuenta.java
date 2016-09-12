/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR
 */
public class Cuenta {
   private int nidentf;
   private double saldact;
   private double intanual;
   private int ncuenta;
   
   public Cuenta (int nidentf, double saldact, double intanual, int ncuenta){
       this.nidentf=nidentf;
       this.saldact=saldact;
       this.intanual=intanual;
       this.ncuenta=ncuenta;
   }

    public int getNidentf() {
        return nidentf;
    }

    public double getSaldact() {
        return saldact;
    }

    public double getIntanual() {
        return intanual;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNidentf(int nidentf) {
        this.nidentf = nidentf;
    }

    public void setSaldact(double saldact) {
        this.saldact = saldact;
    }

    public void setIntanual(double intanual) {
        this.intanual = intanual;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public double actsaldo (){
        double intd,totl,op;
        intd=(this.intanual/365);
        op=(this.saldact*intd)/100;
        this.saldact=this.saldact-op;
        totl=this.saldact;
        return totl;
    }
    public double ingresar (double cantn){
        double op;
        if (cantn<=0){
            op=0;
        }else{
            this.saldact=this.saldact+cantn;
            op=this.saldact;
        }
        return op;
    }
    public double retirar (double cntar){
        double sald;
         if (cntar<this.saldact){
            JOptionPane.showMessageDialog(null, "No posee esta cantidad en su cuenta");
            sald=this.saldact;
         }else{
            sald=this.saldact-cntar;
         }
         return sald;
    }
    public Cuenta mostrar (){
       Cuenta m;
        int ni,nc;
        double sald,inta;
        ni=this.nidentf;
        sald=this.saldact;
        inta=this.intanual;
        nc=this.ncuenta;
        m = new Cuenta (ni,sald,inta,nc);
        return m;
    }
}
