/**
 * ============================================================================
 * UNIVERSIDAD ESPAM MFL - CARRERA DE COMPUTACION / SOFTWARE
 * Asignatura: Programacion Orientada a Objetos (CDS-0201)
 * Docente: Luiggi Alexander Jalca Saltos
 * Clase 02: Taller de Trabajo Autonomo (Material para el Estudiante)
 * ============================================================================
 * CLASE Empleado (Plantilla de Trabajo Autonomo):
 * 
 * OBJETIVO DEL ESTUDIANTE:
 * Implementar la proteccion de invariantes mediante Setters validados:
 * 1. setEdad(int nuevaEdad):
 *    - Invariante: La edad debe ser legal para trabajar en Ecuador (18 a 70 anios).
 *    - Si es valida: asignar a this.edad y retornar true.
 *    - Si es invalida: mostrar mensaje de error en consola y retornar false.
 * 
 * 2. setSueldo(double nuevoSueldo):
 *    - Invariante: El sueldo no puede ser menor al Salario Basico Unificado ($460.00).
 *    - Si es valido: asignar a this.sueldo y retornar true.
 *    - Si es invalido: mostrar mensaje de error en consola y retornar false.
 */


public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    private String cargo; // Dependiendo de lo que ya venía en la plantilla

    // Constante del Salario Básico Unificado (SBU)
    private static final double SBU = 460.00;

    // Constructor
    public Empleado(String nombre, int edad, double sueldo, String cargo) {
        this.nombre = nombre;
        setEdad(edad);
        setSueldo(sueldo);
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Validación de la edad (Rango legal de 18 a 70 años)
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 18 && nuevaEdad <= 70) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Error: La edad debe estar entre 18 y 70 años.");
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    // Validación del sueldo (Mayor o igual al SBU de $460.00)
    public void setSueldo(double nuevoSueldo) {
        if (nuevoSueldo >= SBU) {
            this.sueldo = nuevoSueldo;
        } else {
            System.out.println("Error: El sueldo debe ser mayor o igual al SBU ($460.00).");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimirFicha() {
        System.out.println(" | Nombre: " + this.nombre +
                           " | Edad: " + this.edad + " anios" +
                           " | Cargo: " + this.cargo +
                           " | Sueldo: $" + String.format("%.2f", this.sueldo));
    }
}