/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import br.com.cursojavatrouxas._09_oop_part1.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


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
        
        mapDePessoar.put("eros", new Pessoa("x", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros2", new Pessoa("A", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros3", new Pessoa("B", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros4", new Pessoa("T", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros5", new Pessoa("H", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros6", new Pessoa("I", "branco", "nao sei", "tb nao sei", 98876786, 37));
        mapDePessoar.put("eros7", new Pessoa("V", "branco", "nao sei", "tb nao sei", 98876786, 37));
        
//        System.out.println( mapDePessoar.get ( "eros" ) ) ;
//        System.out.println(mapDePessoar.containsKey("dkdkdk"));
        
//        Collections.sort(listStr);
//       
//        for (int i = 0; i < listStr.size(); i++) {
//            System.out.println(listStr.get(i));
//        }
//
//        Collections.reverse(listStr);
//        for (int i = 0; i < listStr.size(); i++) {
//            System.out.println(listStr.get(i));
//        }
        
        List<Pessoa> listPessoa = new ArrayList<Pessoa>(mapDePessoar.values());
        
//        Collections.sort(listPessoa, Pessoa.ComparatorPessoaNome);
        Collections.sort(listPessoa);
        TreeMap<String,Pessoa>  treeMap = new TreeMap<>(mapDePessoar);
        
        for (Pessoa pessoa : listPessoa) {
            System.out.println(pessoa);
        }
        
//        for(Map.Entry<String,Pessoa> entry : treeMap.entrySet()  ){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
    

    
}
