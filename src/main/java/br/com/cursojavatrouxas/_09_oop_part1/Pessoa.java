/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author eros
 */
public class Pessoa implements Comparable<Pessoa>{
    
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
    
    /**
     * 
     * @param nome
     * @param cabelo
     * @param sexo
     * @param cor da pele
     * @param idade
     * @param qt de dentes
     */
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    
     public static final Comparator ComparatorPessoaNome = new Comparator() {
         Pessoa p1 = null;
         Pessoa p2 = null;
        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Pessoa){
                p1 = (Pessoa) o1;
            }
            if(o2 instanceof Pessoa){
                p2 = (Pessoa) o2;
            }
            return p1.getNome().compareTo(p2.getNome());
        }
    };

    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }

   
    
    
}
