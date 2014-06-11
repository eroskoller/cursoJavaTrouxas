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
public class Onibus extends AutoMovel  implements Utilitario{

    public Onibus(int pneus, int lugares) {
        if(pneus >= 10 && lugares >= 46 ){
                this.pneus = pneus;
                this.lugares = lugares;
                this.motor = "diesel";
                this.potencia = 300;
        }else{
                this.pneus = pneus;
                this.lugares = lugares;
        }
        
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
    
    
    
}
