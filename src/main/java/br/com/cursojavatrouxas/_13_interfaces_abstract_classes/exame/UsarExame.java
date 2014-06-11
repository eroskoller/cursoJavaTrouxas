/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._13_interfaces_abstract_classes.exame;

import java.util.*;

/**
 *
 * @author eros
 */
public class UsarExame {
    
    public static void main(String[] args) {
        
        Creatinina cre = new Creatinina();
        Ureia ur = new Ureia();
        TempoProtropombina tp = new TempoProtropombina();
        Parasitologico para = new Parasitologico();
        UrinaTipo1 uri1 = new UrinaTipo1();
        
        List<Exame> listaDeExames = new ArrayList<>();
        listaDeExames.add(cre);
        listaDeExames.add(ur);
        listaDeExames.add(tp);
        listaDeExames.add(para);
        listaDeExames.add(uri1);
        
        for (Exame exame : listaDeExames) {
            
//            if(exame instanceof Soro){
//                System.out.println("Mande essa porra p o Advia");
//            }else if(exame instanceof Plasma){
//                System.out.println("Mande essa porra p o Modular");
//            }else if(exame instanceof Urina){
//                System.out.println("Mande essa porra p o Urisys");
//            }else if(exame instanceof Fezes){
//                System.out.println("Alguem vai bater bosta..");
//            }
            
//            exame.coleta();
            
            if(exame instanceof Exame){
                exame.coleta();
            }
            
        }
        
        
    }
    
}
