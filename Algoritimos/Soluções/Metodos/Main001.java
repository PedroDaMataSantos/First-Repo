package Metodos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xamax
 * @date 23/06/2025
 * @brief class $(name)

 */
public class Main001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String str = ler.next();
        String resultado = AcharCaractMeio(str);
        System.out.println(resultado);
        
       
        ler.close();
        
    }
    public static String AcharCaractMeio(String str){
        String Retorno;
         int meio = str.length()/2;
        
        if(str.length()%2!=0){
            char strMeio = str.charAt(meio);
           Retorno = "O caractere do meio e: "+strMeio;
            
        }else{
              char strMeio1 = str.charAt(meio-1);
              char strMeio2 = str.charAt(meio);
               Retorno = "Os caracteres do meio sao: "+strMeio1 + " e "+strMeio2;
              
              
             
        }
        return Retorno;
    };


}
