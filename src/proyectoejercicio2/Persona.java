/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio2;

/**
 *
 * @author Ingenieria
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;
    protected String estado;
    
    public Persona(){}
    
    public Persona(String nombre){
        this.nombre = nombre; 
    }
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Persona (String nombre, String apellido, int edad, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //*************************************************  
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
       this.apellido=apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public int getEdad() {
       return this.edad;
    }
    
    public void setSexo (String sexo){
        this.sexo=sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void SetEstado (String estado){
        this.estado=estado;
    }
    
    public String getEstado(){
        return this.estado;
    }
}
