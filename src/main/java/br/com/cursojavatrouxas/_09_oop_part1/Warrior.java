/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

/**
 *
 * @author eros
 * knight
 */
public class Warrior {
    
    String nome = "DorGobid kiro";
    String arma = "Espada";
    String shield = "Dragon Shield";
    String sword = "100";
    String mana = "10";
    
    public void defesa(){
        System.out.println("DorGobid kiro  defende usando a sua fantastica "+shield);
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
