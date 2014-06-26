/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author eros
 */
public class MeuObj implements Comparable<MeuObj>{

    private String nome;
    private String desc;
    private int codigo;
    

    public MeuObj() {
    }

    public MeuObj(String nome, String desc, int codigo) {
        this.nome = nome;
        this.desc = desc;
        this.codigo = codigo;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
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
        final MeuObj other = (MeuObj) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MeuObj{" + "nome=" + nome + ", desc=" + desc + ", codigo=" + codigo + '}';
    }

    

    @Override
    public int compareTo(MeuObj o) {
        return this.getNome().compareTo(o.getNome());
    }
    
    
    public static final Comparator  COMPARADOR_DESCRICAO  = new Comparator<MeuObj>(){
        @Override
        public int compare(MeuObj o1, MeuObj o2) {
            return o1.getDesc().compareTo(o2.getDesc());
        }
    };
    
    public static final Comparator  COMPARADOR_CODIGO  = new Comparator<MeuObj>(){
        @Override
        public int compare(MeuObj o1, MeuObj o2) {
               Integer i1 = new Integer(o1.getCodigo());
                Integer i2 = new Integer(o2.getCodigo());
            
           return  i1.compareTo(i2);
        }
    };
    
    public static final Comparator  COMPARADOR_CODIGO_REVERSO  = new Comparator<MeuObj>(){
        @Override
        public int compare(MeuObj o1, MeuObj o2) {
               Integer i1 = new Integer(o1.getCodigo());
                Integer i2 = new Integer(o2.getCodigo());
            
           return  i2.compareTo(i1);
        }
    };
    
    
}
