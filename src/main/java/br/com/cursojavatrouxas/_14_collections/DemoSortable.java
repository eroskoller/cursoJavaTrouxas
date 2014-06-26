/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._14_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eros
 */
public class DemoSortable {
    
    public static void main(String[] args) {
        
        
        List<String>  listStr = new ArrayList<>();
        
        listStr.add("a");
        listStr.add("b");
        listStr.add("c");
        listStr.add("d");
        listStr.add("e");
        listStr.add("f");
        listStr.add("g");
        
        Collections.reverse(listStr);
        
        for (String string : listStr) {
            System.out.println(string);
        }
        
        Collections.sort(listStr);
        for (String string : listStr) {
            System.out.println(string);
        }
        
        
        
    }
    
}
