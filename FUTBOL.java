/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futbol;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class FUTBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de puntos que obtuvo en cada juego o -1 para terminar:  ");
        int puntosTotales = 0;
       
         int puntos = 0;
         while(puntos != -1) {
             String input = sc.nextLine(); 
             
             try {
             puntos = Integer.parseInt(input);
             if (puntos != -1){
                 puntosTotales += puntos;
             }
                 
             }catch (NumberFormatException e) {
                 System.out.println("Ingrese un numero valido ");
                 
             }
         }
         
         System.out.println(" Los puntos totales son  " + puntosTotales );
         System.exit(0);
         
             
          
        
             
        
        
         
        
                     
             
             
        
        
        
        
    }
    
}
