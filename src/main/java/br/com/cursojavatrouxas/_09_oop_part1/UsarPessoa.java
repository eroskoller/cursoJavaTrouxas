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
                
                
                pacMaria.comer();
                
                Pessoa mariaPac =(Pessoa) pacMaria;
                
                mariaPac.comer();
                
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