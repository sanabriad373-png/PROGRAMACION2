/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Usuario
 */
public class DronCarga extends Dron{
    
private double cargaMaxima;
private double cargaActual;

    public DronCarga(String codigoSerie,int nivelEnergia,boolean vinculadoRed,double cargaMaxima) {
        super(codigoSerie,nivelEnergia,vinculadoRed);
        this.cargaMaxima=cargaMaxima;
        this.cargaActual=0;
    }//fin del constructo DronCarga
    public boolean evaluarPesoObjeto(double pesoNuevo){
        return cargaActual + pesoNuevo > cargaMaxima; 
        }
    public void engancharDesecho(double pesoNevo) {
        if (evaluarPesoObjeto(pesoNevo)) {
            System.out.println("objeto Demasiado PesadoError\n");
        }
        else{
            cargaActual=cargaActual+pesoNevo ;
            System.out.println("Desecho recogido con exito ");
        }
    }//fin engancharDesecho
    public  void descargarContenedorBase() {
        cargaActual=0;
        System.out.println("Contenedor Descargado");
        
    }//descargarContenedorBase
}//fin de class DronCrga

            

