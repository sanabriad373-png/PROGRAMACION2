/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Usuario
 */
public class Dron {
    private String codigoSerie;
    private int nivelEnergia;
    private  boolean vinculadoRed;
    
    //contructor
    public Dron(String codigoSerie,int nivelEnergia, boolean vinculadoRed){
        this.codigoSerie=codigoSerie;
        this.nivelEnergia=nivelEnergia;
        this.vinculadoRed=vinculadoRed;
        
        setNivelEnergia(nivelEnergia);
        calibrarGiroscopioInterno();
       
    }//
 public String getcodigoSerie(){
            return codigoSerie;
        }
        
        public int  getnivelEnergia(){
            return nivelEnergia;
        }
        public boolean getvinculadoRed(){
            return vinculadoRed;
        }
        
  public void setNivelEnergia(int nivelEnergia ){
      if (nivelEnergia<0) {
         this.nivelEnergia=0; 
      }
      else if (nivelEnergia>100){
          this.nivelEnergia=100;
       }else{
    this.nivelEnergia=nivelEnergia;
  }

}//fin setNivelEnergia
  
   private  void  calibrarGiroscopioInterno(){
      System.out.println("Calibrando el Giroscopio......");
  }
   
    public void transmitirEstadoRed() {
        System.out.println("Codigo de serie"+ codigoSerie);
        System.out.println("La Bateria"+nivelEnergia+"%");
        System.out.println("....En linea...."+vinculadoRed);
    }//transmitirEstadoRed() 
  
}//fin de class dron



