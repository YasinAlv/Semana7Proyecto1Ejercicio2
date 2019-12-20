/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class ProyectoEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Menu();
    }
    //********************************************************************
    public static void Menu() {

        int op;
        String nombre, apellido, sexo, horario;
        int edad, nota;
        Scanner Teclado = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();

        do {
            System.out.println("    Opciones");
            System.out.println("    1) Ingresar persona");
            System.out.println("    2) Ingresar Estudiante");
            System.out.println("    3) Ingresar Profesor");
            System.out.println("    4) Imprimir las personas de la lista");
            System.out.println("    5) Buscar una persona");
            System.out.println("    6) Eliminar una persona");
            System.out.println("    7) Salir");
            System.out.println("Digite una opción");

            op = Teclado.nextInt();
            Persona persona = new Persona();////////POLIMORFISMO
            Persona estudiante = new Estudiante();////////POLIMORFISMO
            Persona profesor = new Profesor();////////POLIMORFISMO

            switch (op) {
                case 1:

                    System.out.println("Digite el Nombre de la persona");
                    nombre = Teclado.next();
                    persona.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    persona.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    persona.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    persona.setEdad(edad);
                    persona.SetEstado("Civil");

                    System.out.println("***********************************");
                    System.out.print("Su nombre es: ");
                    System.out.println(persona.getNombre());
                    System.out.print("Su apellido es: ");
                    System.out.println(persona.getApellido());
                    System.out.print("Su Sexo es: ");
                    System.out.println(persona.getSexo());
                    System.out.print("Su edad es: ");
                    System.out.println(persona.getEdad());
                    System.out.println("***********************************");
                    personas.add(persona);
                    break;

                case 2:
                    System.out.println("Digite el Nombre del estudiante");
                    nombre = Teclado.next();
                    estudiante.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    estudiante.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    estudiante.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    estudiante.setEdad(edad);
                    System.out.println("Digite su nota");
                    nota = Teclado.nextInt();
                    ((Estudiante) estudiante).setNota(nota);
                    estudiante.SetEstado("Estudiante");
                    personas.add(estudiante);
                    break;
                case 3:
                    System.out.println("Digite el Nombre del Profesor");
                    nombre = Teclado.next();
                    profesor.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    profesor.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    profesor.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    profesor.setEdad(edad);
                    System.out.println("Digite su horario");
                    horario = Teclado.next();
                    ((Profesor) profesor).setHorario(horario);
                    profesor.SetEstado("Profesor");
                    personas.add(profesor);
                    break;

                case 4:
                    printPersonas(personas);
                    break;
                case 5:
                    System.out.println("Digite el nombre de la persona que desea buscar: ");
                    nombre = Teclado.next();
                    buscarPersona(personas, nombre);
                    break;
                case 6:
                    System.out.println("Digite el nombre de la persona que desea eliminar: ");
                    nombre = Teclado.next();
                    eliminarPersona(personas, nombre);
                    break;
            }
        } while (op != 7);

    }

    //************************************************************************************
    private static void printPersonas(List<Persona> personas) {
        for (Persona persona : personas) {   //for each

            if (persona.getEstado() == "Civil") {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo());
            } else if (persona.getEstado() == "Estudiante") {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo() + " "
                        + ((Estudiante) persona).getNota());
            } else {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo() + " "
                        + ((Profesor) persona).getHorario());
            }
        }
    }
    //************************************************************************************
    private static void buscarPersona(List<Persona> personas, String nombre){
        for (Persona persona : personas) {   //for each

            if (persona.getNombre().equals(nombre)) {
                System.out.println("Persona encontrada!!! Sus datos son: " + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo());
                System.out.print(" "+"Su profesion es: "+persona.getEstado());
            }  else {
                System.out.println("La persona a buscar no existe en la lista de personas, verifique el nombre y vuelva a intentar");
            }
        }
    } 
    //************************************************************************************
    private static void eliminarPersona(List<Persona> personas, String nombre){
        for (int i = 0; i < personas.size(); i++) {
     
            if((personas.get(i).getNombre()) == null ? nombre == null : (personas.get(i).getNombre()).equals(nombre)){
                personas.remove(i);
                System.out.println("Persona eliminada de la lista");
            }
            else{
                System.out.println("La persona a eliminar no se encuentra en la lista!!!");
            }
     }
    } 
//*********************
}
