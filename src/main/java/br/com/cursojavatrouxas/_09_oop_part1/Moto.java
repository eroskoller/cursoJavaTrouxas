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
public class Moto extends AutoMovel{

    public Moto() {
        this.pneus = 2;
        this.lugares = 2;
    }
    
    
    
    public void caiDeBobeira(){
        System.out.println("Toda moto uma hora cai de bobeira.");
    }
    
    public void facilDeAndarNoTransito(){
        System.out.println("Toda moto tem a facilidade de andar no transito usando os corredores..");
    }
    
}
