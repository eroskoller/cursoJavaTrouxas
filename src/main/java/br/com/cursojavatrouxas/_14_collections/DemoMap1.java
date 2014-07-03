/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eros
 */
public class DemoMap1 {
    public static void main(String[] args) {
        Map<String,String>  mapExameDescricao = new HashMap<String,String>();
        mapExameDescricao.put("HEM", "Exame de sangue que calcula emoglobia e hematocritos");
        mapExameDescricao.put("GLI", "Exame que calcula a quantidade de acucar no sangue");
        mapExameDescricao.put("CASA", "Exame que calcula o calcio no sangue");
        mapExameDescricao.put("POT", "Exame que calcula a quantidade de potassio no sangue.");
        
        System.out.println(mapExameDescricao.get("HEM"));
    
        for(Map.Entry<String,String> entry : mapExameDescricao.entrySet()){
            System.out.println("entry.getKey(): "+entry.getKey()+"      entry.getValue(): "+entry.getValue());
        }
        
//        Map<String,InfoStatiEx>  mapStatis  = new HashMap<String, InfoStatiEx>(50000);
        
    }
    
}

class InfoStatiEx{
    long qt;
    double valor;
    String desc;

    public InfoStatiEx(long qt, double valor, String desc) {
        this.qt = qt;
        this.valor = valor;
        this.desc = desc;
    }

    public long getQt() {
        return qt;
    }

    public void setQt(long qt) {
        this.qt = qt;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
