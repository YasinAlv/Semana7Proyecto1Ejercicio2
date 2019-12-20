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
public class Estudiante extends Persona {
    private double nota; //
    
    //CONSTRUCTORES
    public Estudiante(){}
    public Estudiante(String nombre){
        this.nombre = nombre; //sobrecarga de constructores
    }
    public Estudiante (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Estudiante (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Estudiante (String nombre, String apellido, int edad, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Estudiante (String nombre, String apellido, int edad, String sexo, double nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nota = nota;
    }
    
    //*************************SETTERS Y GETTERS
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
       this.apellido=apellido;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setEdad(int edad) {
        this.edad=edad;
    }

    @Override
    public int getEdad() {
       return this.edad;
    }
    
    public void setNota(int nota) {
        this.nota=nota;
    }

    public double getNota() {
       return this.nota;
    }
    
    @Override
    public void setSexo (String sexo){
        this.sexo = sexo;
    }
    
    @Override
    public String getSexo(){
        return this.sexo;
    }
    
    @Override
        public void SetEstado (String estado){
        this.estado=estado;
    }
    
    @Override
    public String getEstado(){
        return this.estado;
    }
}
