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
public class PersonagemTibia    {
    
    protected String nome;
    protected String arma ;
    protected String shield ;
    protected String mana ;
    
    public void defesa(){
        System.out.println(this.nome+" defende usando a sua fantastica "+shield);
    }
    
    public void bateEmRetirada(){
        System.out.println("Qd aparece o GrimrReaper ele corre muito p salvar sua propria vida.");
    }

    @Override
    public String toString() {
        return "Druid{" + "nome=" + nome + ", arma=" + arma + ", shield=" + shield + ", mana=" + mana + '}';
    }
    
}
