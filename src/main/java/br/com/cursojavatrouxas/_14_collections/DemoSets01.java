/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author eros
 */
public class DemoSets01 {
    
    public static void main(String[] args) {
        
        String meuDog = "Marok";
        Set<String> meuSet = new TreeSet();
        
        meuSet.add(meuDog);
        meuSet.add("sky");
        meuSet.add("Popo");
        meuSet.add("Fifi");
        meuSet.add("Fifao");
        meuSet.add("Sultao");
        meuSet.add(meuDog);
        
        for (String string : meuSet) {
            System.out.println(string);
        }
        
    }
    
}
