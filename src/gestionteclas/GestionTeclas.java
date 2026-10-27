/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionteclas;

/**
 *
 * @author Usuario
 */
public class GestionTeclas {

    /**
     * Un equipo de desarrollo de software necesita un sistema para organizar su trabajo.
     * Todo lo que se registra en el sistema es una Tarea Base (tiene un ID y un título). 
     * Un tipo específico de tarea es un Bug (Error de Código), 
     * el cual requiere saber en qué entorno ocurrió (ej. Producción, Pruebas). 
     * Finalmente, existen los Bugs de Seguridad, que son errores críticos que, 
     * además de lo anterior, deben registrar el código de vulnerabilidad (CVE) y si los datos de los usuarios están expuestos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
   TareaBase tarea1 = new TareaBase("TB-01", "Prueba 1", true);
        tarea1.marcoResuelto();
        
        System.out.println("\nPrioridad: "+tarea1.calculadoraPrioriad());
        
        System.out.println("\n");
        System.out.println("SIGUE EL HIJO de TAREA BASE");
        System.out.println("");
        
        Bugs bugs1 = new Bugs("B-01","Prueba 1B",true,"Produccion");
        bugs1.marcoResuelto();
        
        System.out.println("\nPrioridad: "+bugs1.calcularPrioridad());
        
        System.out.println("\n");
        System.out.println("SIGUE EL NIETO de TAREA BASE");
        System.out.println("SIGUE EL HIJO de BUGS");
        System.out.println("");
        BugSeguriadad bs = new BugSeguriadad("BS-01","Prueba 1BS",true,"Produccion","CVE - 1",true);
       
    }//fin del main
    
}//fin de class
