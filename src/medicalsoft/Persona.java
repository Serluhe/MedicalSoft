/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author estudiante
 */
public class Persona {

    private String Nombre;
    private String Apellido ;
    private String Fecha_de_nacimiento;
    private String Identificación;
    private String Género;
    private String Dirección;
    private String Email;
    private String Teléfono;
    private String Celular;

        public Persona(String Nom, String Ape) {
        this.Nombre = Nom;
        this.Apellido = Ape;
    }
        
    public String getNombre() {
        return Nombre.toUpperCase();
    }

    public String getApellido() {
        return Apellido;
    }

    public String getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    public String getIdentificación() {
        return Identificación;
    }

    public String getGénero() {
        return Género;
    }

    public String getDirección() {
        return Dirección;
    }

    public String getEmail() {
        return Email;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setFecha_de_nacimiento(String Fecha_de_nacimiento) {
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
    }

    public void setIdentificación(String Identificación) {
        this.Identificación = Identificación;
    }

    public void setGénero(String Género) {
        this.Género = Género;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
   //public int calcuedad (Fecha_de_nacimiento){
  //  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  //  LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
  //  LocalDate ahora = LocalDate.now();

    //Period periodo = Period.between(fechaNac, ahora);
   // return 0;
   //}


    public int calculaEdad(Calendar fechaNac) {
        Calendar today = Calendar.getInstance();

        int diff_year = today.get(Calendar.YEAR) -  fechaNac.get(Calendar.YEAR);
        int diff_month = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int diff_day = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        //Si está en ese año pero todavía no los ha cumplido
        if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
            diff_year = diff_year - 1; //no aparecían los dos guiones del postincremento :|
        }
        return diff_year;
    }
    
    
}

