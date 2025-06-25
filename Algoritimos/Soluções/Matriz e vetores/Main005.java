

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 25/06/2025
 * @brief class $(name)

 */
public class Main005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int i,aux;
        int[]N = new int[20];
        
        for(i=0;i<N.length;i++){
            N[i]=ler.nextInt();   
        }
         for(i=0;i<N.length/2;i++){
                 aux = N[i];
                 N[i]=N[N.length-1-i];
                 N[N.length-1-i]=aux;
             }
              
        
          for(i=0;i<N.length;i++){
            System.out.printf("N[%d] = %d\n",i,N[i]);
        }

    }
} 