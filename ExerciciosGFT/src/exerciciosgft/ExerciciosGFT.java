/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosgft;

import java.util.Scanner;

/**
 *
 * @author SarahGodoy
 */
public class ExerciciosGFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String alimento; 
        int calorias;
        int resultado = 0;
        int soma = 0;
        
        System.out.print("Digite a quantidade de calorias: ");
        Scanner teclado = new Scanner(System.in);
        int maxCal = Integer.parseInt(teclado.nextLine());
        
        System.out.println("----- Alimentos consumidos -----");
        
        do{        
            System.out.println("Nome do alimento: ");
            alimento = teclado.nextLine();

            System.out.println("Quantidade: ");
            calorias = Integer.parseInt(teclado.nextLine());
            soma = soma + calorias;
        } while(!"sair".equals(alimento));
        
        System.out.println("-------------------------");
        System.out.printf("Você consumiu %d calorias e ficou %s", soma, resultado);
        if (soma<maxCal){
            System.out.print("abaixo da meta");
        }else if(soma==maxCal){
            System.out.println("na da meta");
        }else{
            System.out.println("acima da meta");
        }
        
    }
    
}
