/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class MedicalSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico primerMedico = new Medico("Carlos", " Azar");
       // primerMedico.Nombre="Carlos";
        //System.out.println(primerMedico.Nombre+primerMedico.Apellido);
        System.out.println("\"Carlos\", \" Azar\"");primerMedico.getNombre();
    }
    
}
