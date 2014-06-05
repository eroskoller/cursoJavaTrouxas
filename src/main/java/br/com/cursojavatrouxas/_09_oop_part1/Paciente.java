/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

/**
 *
 * @author eros
 */
public class Paciente extends Pessoa{

    protected String codigoSUS;
    protected String prontuario;
    protected String convenio;
    protected ReceitaMedica[] arrayReceitaMedica;
    
    
    public Paciente(String n, String c, String se, String cr, int idd, int dts) {
        super(n, c, se, cr, idd, dts);
    }

    @Override
    public String toString() {
        
        return super.toString()+ " \n Paciente{" + "codigoSUS=" + codigoSUS + ", prontuario=" + prontuario + ", convenio=" + convenio + ", arrayReceitaMedica=" + arrayReceitaMedica + '}';
    }

    
    @Override
    public void comer() {
        System.out.println("todo paciente come a droga da comida do hospital.");
    }
    

    
    
}
