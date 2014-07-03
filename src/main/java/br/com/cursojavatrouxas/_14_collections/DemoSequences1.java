/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author eros
 */
public class DemoSequences1 {
    public static void main(String[] args) {
        String meuDog = "Marok";
        List<String> meuSet = new ArrayList();
        
        meuSet.add(meuDog);
        meuSet.add("sky");
        meuSet.add("Popo");
        meuSet.add("Fifi");
        meuSet.add("Fifao");
        meuSet.add("Sultao");
        meuSet.add(meuDog);
        meuSet.add(null);
        
        for (String string : meuSet) {
            System.out.println(string);
        }
    }
}
