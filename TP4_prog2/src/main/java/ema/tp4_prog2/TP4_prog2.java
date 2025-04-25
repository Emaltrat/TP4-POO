
package ema.tp4_prog2;


public class TP4_prog2 {
 

    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1,"Nahuel","Maquinista",15000);
        Empleado emp2 = new Empleado(2,"Cristian","Encargado",18000);
        Empleado emp3 = new Empleado("Emanuel","Operario");
        Empleado emp4 = new Empleado("Mario","Operario");
        

    
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("");
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(3000);
        System.out.println("");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("--------------------------------------");  
        Empleado.mostrarTotalEmpleados();
    
    }
}
