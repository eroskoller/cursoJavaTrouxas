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
public class Pessoa {
    
    private long id;
    protected String nome;
    protected String cabelo;
    protected String sexo;
    protected String cor;
    protected int idade;
    protected int dentes;
    
    public int intComer;
    public int intHoras;
    public int intTomarBanho;

    
    
    public Pessoa() {
        this.id = (long)(Math.random()*1000);
    }
    
    
    public Pessoa(String n, String c, String se, String cr, int idd, int dts) {
        
        id = (long)(Math.random()*1000);
        this.nome = n;
        this.cabelo = c;
        sexo = se;
        cor = cr;
        idade = idd;
        this.dentes = dts;
    }

    
    
    
    
    
    public void comer(){
        System.out.println("toda pessoa come de preferencia "+intComer+" vezes ao dia.");
    }
    
    public void dorme(){
        System.out.println("toda pessoa dorme de preferencia "+intHoras+" horas por dia.");
    }
    
    public void tomarBanho(){
        System.out.println("toda pessoa toma banho de preferencia "+intTomarBanho+" vez por dia.");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cabelo=" + cabelo + ", sexo=" + sexo + ", cor=" + cor + ", idade=" + idade + ", dentes=" + dentes + '}';
    }

}
