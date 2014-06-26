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
public class DemoSortable2 {
    
    public static void main(String[] args) {
        
        Map<String,MeuObj>  mapMeuObj = new HashMap<>();
        
        mapMeuObj.put("1234", new MeuObj("primeiro", "o primeito obj",0));
        mapMeuObj.put("4321", new MeuObj("segundo", "o segundo obj",1));
        mapMeuObj.put("000", new MeuObj("terceiro", "o terceiro obj",2));
        
        for (Map.Entry<String, MeuObj> entry : mapMeuObj.entrySet()) {
//            System.out.println(entry.getValue());
        }
        
        
        
        List<MeuObj> listMeuObj = new ArrayList<>(mapMeuObj.values());
        Collections.sort(listMeuObj,MeuObj.COMPARADOR_CODIGO);
        
        for (MeuObj meuObj : listMeuObj) {
            System.out.println(meuObj);
        }
        
        
        
    }
    
}
