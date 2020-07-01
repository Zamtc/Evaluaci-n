package Enunciado01;

import java.util.Scanner;

public class ArregloPersona {
    int tope;
    int max;
    Persona [] persona;
    Persona perso = new Persona();
    static Scanner teclado = new Scanner (System.in); 
   public ArregloPersona( int max){
        this.tope = 0;
        this.max = max;
        this.persona = new Persona [this.max + 1];   
        for (int i = 0; i<this.max+1; i++ ){
            persona[i] = new Persona();
        } 
}
 public ArregloPersona (){
        this.tope = 0;
        this.max = 100;
        this.persona = new Persona[this.max + 1];      
    }
    public int getTope(){
        return tope = 0;        
    }
    public boolean DatosLlena(){
        if (this.max == this.tope){
            return true;   
        }else {
            return false;
        }
    }
    public boolean DatosVacia(){
        if(this.tope== 0) {
            return true;
        }else {
            return false ;
        }
    }
     public void InsertarDatos(int pos, String codigo, String nombre, int horas, double tarifa){
        persona[pos].datos(codigo, nombre, horas, tarifa);
         tope++;
        }
    public void MostrarDatos() {
       if (this.DatosVacia()){
        System.out.println( "El arreglo está vacio....");
     }else {
          for (int i=0; i<tope; i++){
              System.out.println(persona[i].Cadena());
          }
       }
    }
    public void EliminarTrabajador(){    
        if (this.DatosVacia()){
        System.out.println( "El arreglo está vacio....");
     }else {
            this.tope--;
    System.out.println( "Arrreglo eliminado correctamente...");  
        }
    }
    
    
    
    public void BuscarTrabajador(String buscar){
        for (int i=0; i< tope ;i++){
        if (persona[i].getCodigo().equals(buscar)){
            System.out.println(persona[i].Cadena());
        }
        }
    }
    
}
