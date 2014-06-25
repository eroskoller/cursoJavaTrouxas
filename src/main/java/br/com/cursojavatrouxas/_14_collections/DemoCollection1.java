/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import br.com.cursojavatrouxas._09_oop_part1.Pessoa;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


/**
 *
 * @author eros
 */
public class DemoCollection1 {
    
    public static void main(String[] args) {
        
        List<String>  listStr = new ArrayList<>();
        listStr.add("Sky");
        listStr.add("Marok");
        listStr.add("Fifi");
        listStr.add("Fifao");
        
        Map<String , Pessoa > mapDePessoar = new Hashtable<>();
        
        mapDePessoar.put("eros", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros2", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros3", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros4", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros5", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros6", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros7", new Pessoa("Eros Koller", "branco", "nao sei", "tb nao sei", 98876786, 37));
        
        System.out.println( mapDePessoar.get ( "eros" ) ) ;
        System.out.println(mapDePessoar.containsKey("dkdkdk"));
        
        
    }
    
}
