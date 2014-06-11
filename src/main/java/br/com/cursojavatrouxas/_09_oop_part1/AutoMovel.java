/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

/**
 *
 * @author eros
 */
public class AutoMovel {
    
    public int pneus;
    public String motor;
    public int potencia;
    public String cor;
    public int lugares;

    public AutoMovel() {
    }

    public AutoMovel(int pneus, int lugares) {
        this.pneus = pneus;
        this.lugares = lugares;
    }

    public AutoMovel(int pneus, String motor, int potencia, String cor, int lugares) {
        this.pneus = pneus;
        this.motor = motor;
        this.potencia = potencia;
        this.cor = cor;
        this.lugares = lugares;
        System.out.println("Contruindo o meu automovel..");
    }
    
    public void movimentar(){
        System.out.println("Todo automovel tem a capaciadade de se movimentar..");
    }
    
    
}
