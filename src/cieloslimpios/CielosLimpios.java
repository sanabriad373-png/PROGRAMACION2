/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Usuario
 */
public class CielosLimpios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    DronReconocimientoTactico[]escuadronTactico=new DronReconocimientoTactico[3];
    DronCarga[]escuadronPesado=new DronCarga[2];
    
        for (int i = 0; i < 3; i++) {
            escuadronTactico[i]=new DronReconocimientoTactico("TAH", 80, true);
            
        }//FIN DEL FOR
        for (int i = 0; i < 2; i++) {
            escuadronPesado[i]=new DronCarga("TBH",60 , true, 50.0);
            
        }//Fin del for  escuadronPesado
        
        for (int i = 0; i < 3; i++) {
            escuadronTactico[i].generarMapeoEstocastico();
            escuadronTactico[i].analizarAmanenazas();
        }//fin del for  escuadronTactico
       
        for (int i = 0; i < 2; i++) {
             double peso = Math.random() * 120;
             escuadronPesado[i].engancharDesecho(peso);
             escuadronPesado[i].descargarContenedorBase();
        }//fin del for  escuadronPesado
        
        for (int i = 0; i < 3; i++) {
            escuadronTactico[i].setNivelEnergia(-30);
              }//for 
        
        for (int i = 0; i < 2; i++) {
            escuadronPesado[i].setNivelEnergia(700);
        }//for
        
        for (int i = 0; i < 3; i++) {
            escuadronTactico[i].transmitirEstadoRed();
        }//for
        
        for (int i = 0; i < 2; i++) {
            escuadronPesado[i].transmitirEstadoRed();
            
        }//for
    }//fin del main
    
}//fin de la class
