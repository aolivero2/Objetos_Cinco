
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
   private long nidentf;
   private double saldact;
   private long ncuenta;

    public Cuenta(long nidentf, double saldact, long ncuenta) {
        this.nidentf = nidentf;
        this.saldact = saldact;
        this.ncuenta = ncuenta;
    }
    public Cuenta (long ncuenta,long nidentf){
        this.ncuenta=ncuenta;
        this.nidentf=nidentf;
        this.saldact=0;
    }

    public long getNidentf() {
        return nidentf;
    }

    public double getSaldact() {
        return saldact;
    }

    public long getNcuenta() {
        return ncuenta;
    }

    public void setNidentf(long nidentf) {
        this.nidentf = nidentf;
    }

    public void setSaldact(double saldact) {
        this.saldact = saldact;
    }

    public void setNcuenta(long ncuenta) {
        this.ncuenta = ncuenta;
    }
   public void actualizarsald (double inan){
      double aux,aux2;
      aux=this.getSaldact()*(inan/365);
      aux2=this.getSaldact()+aux;
      this.setSaldact(aux2);
   }
   public void ingresar (double ingreso){
       double aux;
       aux=this.getSaldact()+ingreso;
       this.setSaldact(aux);
   }
   public void retirar (double egreso){
       double aux;
       aux=this.getSaldact()-egreso;
       this.setSaldact(aux);
   }
   public String mostrar (){
       String aux;
        aux= "No. de la cuenta es: "+this.getNcuenta()+"\n"
        + "No. de identificacion es: "+this.getNidentf()+"\n"
        + "Saldo actual es: "+this.getSaldact();
      return aux;
   }
}
