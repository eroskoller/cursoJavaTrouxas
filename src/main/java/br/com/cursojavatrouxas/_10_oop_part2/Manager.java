/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._10_oop_part2;

/**
 *
 * @author eros
 */
public class Manager extends Employee{

    public Manager() {
    }

    
    public Manager(String strName, String strFunc, int intId) {
        super(strName, strFunc, intId);
    }

    @Override
    protected void doWork() {
        System.out.println("Manage all day and sleep at night..");
    }
    
    public final void manage(){
        System.out.println("Only a Manager can manage and no body else.");
    }
    
    
}
