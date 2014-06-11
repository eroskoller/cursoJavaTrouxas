/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

import br.com.cursojavatrouxas._13_interfaces_abstract_classes.Quadrado;

/**
 *
 * @author eros
 */
public  abstract class Cubo implements Quadrado{

    public int x;
    public int y;
    public int z;

    @Override
    public double calculoDeAreaQuadrada() {
        return  x*y;
    }
    
    
    public double calculoDeAreaCubica() {
        return  x*y*z;
    }
  
    public abstract String calculoDeAreaCubicaEmLitros() ;
    
}
