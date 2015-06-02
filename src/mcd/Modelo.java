/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

/**
 *
 * @author dpazolopez
 */
public class Modelo {

    public int numero1;
    public int numero2;
    public String mensajeResultado = "";

    public Modelo() {
    }

    public Modelo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
        if (numero1 < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
        if (numero2 < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public void setMensajeResultado(String mensajeResultado) {
        this.mensajeResultado = mensajeResultado;
    }

}
