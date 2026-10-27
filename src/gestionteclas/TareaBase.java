/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionteclas;

/**
 *
 * @author Daniel
 */
public class TareaBase {
   private  String idTicket;
   private String titulo;
   protected boolean resuelto;

public  TareaBase(String idTicket, String titulo,boolean resuelto){
    this.idTicket=idTicket;
    this.titulo=titulo;
    this.resuelto=resuelto;
    
}//fin del constructor
public void marcoResuelto() {
    this.resuelto=true;
    System.out.printf("El ticket %s ha sido cerrado ",this.idTicket);
    System.out.printf("Nombre Ticket %s",this.titulo);    
    }
public int  calculadoraPrioriad(){
    return 1;
}
}//Fin de class tarea base
