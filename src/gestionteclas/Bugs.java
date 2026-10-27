/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionteclas;

/**
 *
 * @author Usuario
 */

    
    public class Bugs extends TareaBase{
       private String entorno;
    
    public Bugs(String idTicketHIJO, String tituloHIJO, boolean resueltoHIJO,
                String entorno){
        super(idTicketHIJO,tituloHIJO,resueltoHIJO);
        this.entorno = entorno;
    }
    
    
    public int calcularPrioridad(){
        if(this.entorno.equals("Produccion")){
            return 3;
        }
        else
        {
            return 2;
        }        
    }
    
    
}//Fin class Bugs
