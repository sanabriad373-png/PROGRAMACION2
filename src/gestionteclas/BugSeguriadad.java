/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionteclas;

/**
 *
 * @author Usuario
 */
public class BugSeguriadad extends Bugs{
    private String codigoCVE;
    private boolean datosExpuestos;
    
    public BugSeguriadad(String idTicketNIETO, String idTituloNIETO, boolean resueltoNIETO,
                        String entornoHIJO, 
                        String codigoCVE, boolean datosEXP){
        super(idTicketNIETO,idTituloNIETO,resueltoNIETO,entornoHIJO);
        this.codigoCVE = codigoCVE;
        this.datosExpuestos = datosEXP;
    }
}
