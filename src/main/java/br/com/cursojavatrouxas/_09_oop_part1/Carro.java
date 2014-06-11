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
public class Carro extends AutoMovel implements Utilitario,TrioEletricoAmbulante  { 

    public Carro(int lugares, int potencia) {
        if(lugares <= 2 && potencia >= 200){
            this.motor = "turbo";
            this.lugares = lugares;
            this.potencia = potencia;
            System.out.println("Acabei de criar um carro espotivo...");
        }else{
            this.lugares = lugares;
            this.potencia = potencia;
            System.out.println("Acabei de criar um carro comum...");
        }
        
    }

    @Override
    public void movimentar() {
        System.out.println("Movimenta-se sobre quatro rodas.");
    }

    @Override
    public void carregaAsCompras() {
        System.out.println("Carregando as Compras");
    }

    @Override
    public void levaAFamiliaParaViajar() {
        System.out.println("Levando a Familia para Viajar");
    }

    @Override
    public void pagaIPVAcaroPacas() {
        System.out.println("Pagando a droga do IPVA caro pacas.");
    }

    @Override
    public void temSomInterno() {
        System.out.println("todo carro que se preza tem um som interno.");
    }
    
}
