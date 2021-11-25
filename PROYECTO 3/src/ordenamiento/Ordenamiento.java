/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Familia Rayo
 */

    

public class Ordenamiento {

 
 
    
    String [] vector;//creacion de un array para almacenar los datos y odenarlos

    public Ordenamiento(String[] vector){
        this.vector=vector;
    
    }
    public void ordenar(){
        for(int i=0; i<vector.length; i++){
            for(int j=0; i<vector.length && i!=j; j++){
                if(vector[i].compareToIgnoreCase(vector[j])<0){
                String aux=vector[i];
                vector[i]=vector[j];
                vector[j]=aux;
                }
            }
        
        
        
        }
    
    
    }
    public void mostrar(){
        for(int i=0; i<vector.length; i++){
        
            System.out.println(vector[i]);
        }
    
    }
    
}
