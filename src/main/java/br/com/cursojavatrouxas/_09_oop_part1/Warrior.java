/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

import java.io.Serializable;

/**
 *
 * @author eros
 * knight
 */
public class Warrior  extends PersonagemTibia implements  Serializable{
    
    
    String sword = "100";
    

    public Warrior() {
    }

    public Warrior(String nome ,String arma ,String shield ,String sword ,String mana) {
        this.nome = nome;
        this.arma = arma;
        this.shield = shield;
        this.sword = sword;
        this.mana = mana;
    }
    
    
    
    
    
    
    
    @Override
    public void defesa(){
        System.out.println(this.nome+" defende usando a sua fantastica "+shield);
    }
    
    public void luta(){
        System.out.println("Luta bravamente c sua "+arma);
    }
    
    public void bateEmRetirada(){
        System.out.println("Qd aparece o GrimrReaper ele corre muito p salvar sua propria vida.");
    }

    
    public String toString() {
        return "Warrior{" + "nome=" + nome + ", arma=" + arma + ", shield=" + shield + ", sword=" + sword + ", mana=" + mana + '}';
    }
    
}
