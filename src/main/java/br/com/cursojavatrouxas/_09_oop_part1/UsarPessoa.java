/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._09_oop_part1;

import br.com.cursojavatrouxas._11_wk_w_math_and_dt.DemoDateRange;
import java.util.Date;

/**
 *
 * @author eros
 */
public class UsarPessoa {
    public static void main(String[] args) {
        
//        Pessoa eros = new Pessoa("Eros", "loiro", "MaXo", "branco", 37, 32);
//        
//                eros.intComer = 2;
//                eros.intHoras = 8;
//                eros.intTomarBanho = 1;
                
//                eros.comer();
//                eros.dorme();
//                eros.tomarBanho();
                
//                System.out.println(eros.id);
                
                Paciente pacMaria = new Paciente("Maria", "morena", "Fema", "jambo", 35, 28);
                pacMaria.codigoSUS = "988776654";
                pacMaria.convenio = "SUS";
                Medicamentos[] arrMedicamentoses  = {new Medicamentos("diazepan"),new Medicamentos("aspirina")};
                ReceitaMedica[] arrayReceitaMedica = {new ReceitaMedica(arrMedicamentoses)};
                pacMaria.arrayReceitaMedica = arrayReceitaMedica;

                Pessoa mariaPac =(Pessoa) pacMaria;
                
                if(mariaPac instanceof Paciente){
                    System.out.println("mariaPac e um paciente");
                }else if(mariaPac instanceof Pessoa){
                    System.out.println("mariaPac e uma pessoa");
                }
                
//                for (int i = 0; i < pacMaria.arrayReceitaMedica.length; i++) {
//                        ReceitaMedica rm = pacMaria.arrayReceitaMedica[i];
//                        for (int j = 0; j < rm.arrMedicamentoses.length; j++) {
//                                Medicamentos m = rm.arrMedicamentoses[j];
//                                System.out.println(m.toString());
//                        }
//                }
//        
//                Paciente eliane = pacMaria;
//                eliane.nome = "Eliane";
//                
//                System.out.println(eliane.toString());
//                
//                for (int i = 0; i < eliane.arrayReceitaMedica.length; i++) {
//                        ReceitaMedica rm = eliane.arrayReceitaMedica[i];
//                        for (int j = 0; j < rm.arrMedicamentoses.length; j++) {
//                                Medicamentos m = rm.arrMedicamentoses[j];
//                                System.out.println(m.toString());
//                        }
//                }
                
    }
    
}
