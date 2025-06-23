/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Pedro da Mata  <pescariaurbana@gmail.com>
 * @date 16/06/2025
 * @brief Class Main
 */
public class Main003 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler =new Scanner (System.in);
        int i;
        int []X=new int [10];
        for(i=0;i<10;i++){
            X[i]= ler.nextInt();
        }
         for(i=0;i<10;i++){
            if(X[i]<=0){
                X[i]=1;
            }
        }
         for(i=0;i<10;i++){
             System.out.printf("X[%d] = %d\n",i,X[i]);
            
         }
         ler.close();
        
        
    }


}
