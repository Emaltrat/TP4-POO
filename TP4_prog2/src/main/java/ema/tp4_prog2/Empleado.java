
package ema.tp4_prog2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    int regEmpleo;
    private static Set<Integer> idsUsados = new HashSet<>();

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        idsUsados.add(this.id);
        totalEmpleados+=1;
        regEmpleo=totalEmpleados;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = idAutomatico();
        this.salario = 10000.0;
        totalEmpleados+=1;
        regEmpleo=totalEmpleados;
    }

    private int idAutomatico() {
        Random rnd = new Random();
        int Id;
        do {
            Id = rnd.nextInt(10);
        } while (idsUsados.contains(Id));
        idsUsados.add(Id);
        return Id;
    }
    

    public void actualizarSalario(double porcentaje) {
    System.out.println("Actualizando salario por porcentaje del empleado "+regEmpleo+" ...");
        this.salario += this.salario * (porcentaje / 100);
    }


    public void actualizarSalario(int cantidadFija) {
        System.out.println("Actualizando salario por cantidad fija del empleado "+regEmpleo+" ...");
        this.salario += cantidadFija;
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("El total de empleados ingresados es: " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado "+regEmpleo+":\nid= " + id + " - nombre= " + nombre + " - puesto= " + puesto + " - salario= " + salario;
    }
}
