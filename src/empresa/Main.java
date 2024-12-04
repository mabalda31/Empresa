/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la empresa con valores predeterminados
        Empresa empresa = new Empresa();

        int opcion;
        do {
            System.out.println("\n===============================");
            System.out.println("      ALEJANDRO ASSOCIATION");
            System.out.println("           RUC: 9876543210");
            System.out.println("===============================");
            System.out.println("1. Revisar empleados");
            System.out.println("2. Agregar empleado");
            System.out.println("3. Quitar empleado por cedula");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir línea en blanco

            switch (opcion) {
                case 1:
                    empresa.listarEmpleados();
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del empleado: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese la cedula del empleado: ");
                    String cedula = scanner.nextLine();

                    empresa.agregarEmpleado(nombre, apellido, cedula);
                    break;

                case 3:
                    System.out.print("Ingrese la cedula del empleado a eliminar: ");
                    String cedulaEliminar = scanner.nextLine();
                    empresa.eliminarEmpleadoPorCedula(cedulaEliminar);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}