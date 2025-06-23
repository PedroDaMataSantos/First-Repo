/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Metodos;

import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 23/06/2025
 * @brief class $(name)

 */
public class Main002 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String str = ler.next();
        int vogais = QtsVogaisTem(str);
        System.out.println(vogais);
        ler.close();
        
        
    }
    public static int QtsVogaisTem(String str){
        int i,j;
        String vogais = "aeiou";
    
        int cont = 0;
        for(i=0;i<str.length();i++){
            char letraAtual = str.charAt(i);
            for(j=0;j<vogais.length();j++){
                char vogalAtual = vogais.charAt(j);
            if(Character.toLowerCase(letraAtual)==vogalAtual){
                cont += 1;
            
            }
            
        }
          
    
     

}
        return cont;
      
    }
}


 