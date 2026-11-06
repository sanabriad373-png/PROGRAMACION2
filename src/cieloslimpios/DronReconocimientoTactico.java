/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class DronReconocimientoTactico extends Dron{
    
    private int [] lectura=new int[7];
    
    public DronReconocimientoTactico(String codigoSerie,int nivelEnergia,boolean vinculadoRed){
     super(codigoSerie,nivelEnergia,vinculadoRed);
}//fin del contructor
    public void generarMapeoEstocastico() {
        Random rand =new Random();
        for (int i = 0; i < 7; i++) {
            lectura[i] = rand.nextInt(51);
        }//fin del for
    }//fin de generarMapeoEstocatico
    public void analizarAmanenazas() {
        for (int i = 0; i<7; i++) {
            if (lectura[i] > 35) {
            emitirAlertaIncendio();
            return;   
            }
        }//fin del for
    }//fin de AnalizarAmanenaza
    private void emitirAlertaIncendio(){
        System.out.println("ALERTA ROJA!....Posible incendio en el sector");
    }//FIN EmitirAlertaIncendio
}//FIN DE CLASS  DronReconocimientoTactico
