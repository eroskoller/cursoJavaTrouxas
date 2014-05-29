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
public class UsarWarrior {
    
    public static void main(String[] args) {
        
        Warrior w1 = new Warrior();
        
        
        Warrior w2 = new Warrior("Thor", "Hammer", "O do capitao america", "200", "negra");
        Warrior w3 = new Warrior("Scarlet", "Peitos", "beleza", "2000", "sexy");
        
//        w1.bateEmRetirada();
        
        
        PersonagemTibia p1 = new Warrior("Hulk", "braco", "peito", "10000", "esmaga");
        
        Warrior w4 = (Warrior) p1;
        
        System.out.println(w4.toString());
        
//        
//        System.out.println(w1);
//        System.out.println(w2);
//        System.out.println(w3);
    }
    
}
