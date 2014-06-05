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
public class ReceitaMedica {

    protected Medicamentos[] arrMedicamentoses;

    public ReceitaMedica(Medicamentos[] arrMedicamentoses) {
        this.arrMedicamentoses = arrMedicamentoses;
    }

    @Override
    public String toString() {
        return "ReceitaMedica{" + "arrMedicamentoses=" + arrMedicamentoses + '}';
    }

    
}


    class Medicamentos {
            public  String nomeDoRemedio;

    public Medicamentos(String nomeDoRemedio) {
        this.nomeDoRemedio = nomeDoRemedio;
    }

    @Override
    public String toString() {
        return "Medicamentos{" + "nomeDoRemedio=" + nomeDoRemedio + '}';
    }
            
            
    }
