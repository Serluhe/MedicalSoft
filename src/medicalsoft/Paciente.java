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
public class Paciente {

    private String Nombre;
    private String Apellido ;
    private String Fecha_de_nacimiento;
    private String Identificación;
    private String Género;
    private String Dirección;
    private String Email;
    private String Teléfono;
    private String Celular;

    
       public Paciente(String Nom, String Ape) {
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
    
   
    

 

    
}
