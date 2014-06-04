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
public class Employee {
    protected String strName;
    protected String strFunc;
    protected int intId;
    private int pri;
    protected int pro;
    public int pu;
    
    
    public Employee() {
        System.out.println("A new Employee was created.");
    }

    public Employee(String strName, String strFunc, int intId) {
        this.strName = strName;
        this.strFunc = strFunc;
        this.intId = intId;
        System.out.println("Employee : " + "strName= " + strName + ", strFunc= " + strFunc + ", intId= " + intId );
    }
    
    
    protected void  doWork(){
        System.out.println("Work all day and sleep at night..");
    }


    
}
