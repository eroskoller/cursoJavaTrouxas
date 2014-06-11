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

    @Override
    public void movimentar() {
        System.out.println("Moto anda sobre duas rodas e entre carros.");
    }
    
    public void cai(){
        System.out.println("Somente motos caem de bobeira.");
    }
    
}
