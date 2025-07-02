/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;


/**
 *
 * @author xamax
 * @date 02/07/2025
 * @brief class $(name)

 */


public class Main003 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite uma frase para contar as palavras:");
        String strs = ler.nextLine(); 

        int n = contarPalavras(strs);

        System.out.println("Numero de palavras na string: " + n);

        
    }

    
   public static int contarPalavras(String texto) {
      

   
    
 

        int cont = 1;
        
       
        for (int i = 0; i < texto.length(); i++) {
            char carac = texto.charAt(i);

           
            if (carac == ' ') {
                
                    cont++;
                   
                }
           
            }
        

        return cont;
    }
}
