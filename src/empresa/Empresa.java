/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
    private String nombre;
    private String ruc;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Empresa() {
        this.nombre = "ALEJANDRO ASSOCIATION";
        this.ruc = "9876543210";
        this.empleados = new ArrayList<>();
    }

    // Agregar empleado
    public void agregarEmpleado(String nombre, String apellido, String cedula) {
        empleados.add(new Empleado(nombre, apellido, cedula));
        System.out.println("Empleado agregado: " + nombre + " " + apellido);
    }

    // Eliminar empleado por cédula
    public void eliminarEmpleadoPorCedula(String cedula) {
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getCedula().equals(cedula)) {
                iterator.remove();
                System.out.println("Empleado eliminado: " + empleado.getNombre() + " " + empleado.getApellido());
                return;
            }
        }
        System.out.println("Empleado con cédula " + cedula + " no encontrado.");
    }

    // Listar empleados
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la empresa.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    // Clase interna Empleado
    private class Empleado {
        private String nombre;
        private String apellido;
        private String cedula;

        // Constructor
        public Empleado(String nombre, String apellido, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getCedula() {
            return cedula;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", cedula='" + cedula + '\'' +
                    '}';
        }
    }
}