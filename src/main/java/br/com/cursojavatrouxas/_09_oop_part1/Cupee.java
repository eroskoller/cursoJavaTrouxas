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
public class Cupee extends Carro implements Conversivel{

    public Cupee(int lugares, int potencia) {
        super(lugares, potencia);
    }

    @Override
    public void abrirOTeto() {
        System.out.println("todo conversivel tem a capacidade de abrir o teto.");
    }
    
}
