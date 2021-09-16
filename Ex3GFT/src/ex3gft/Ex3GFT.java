/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3gft;

import java.util.Scanner;

/**
 *
 * @author SarahGodoy
 */
public class Ex3GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int numero, maior, menor;

        Scanner teclado = new Scanner(System.in);
        for(int i=0; i < 5; i++){  
                System.out.println("\nDigite 5 numeros");
                numero = teclado.nextInt();
        }*/
        int maior = 0; 
        int cont = 1; 
        int segundo = 0;
        Scanner teclado = new Scanner(System.in);
         
        while(cont <= 10) {
           cont ++;
           System.out.println("\nDigite o número no campo: ");
            int numero = Integer.parseInt(teclado.nextLine());
                
            int num = numero;
            if(num>maior) {
                segundo = maior;       
                maior = num;
            }  
            if(num<maior && num>segundo){
                segundo = num;
            }
        }              
    }
}
