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
    public static void main(String[] args) {
        Scanner ler =new Scanner (System.in);
        int i,j=0;
        int [][]X=new int [10][1];
        for(i=0;i<10;i++){
            X[i][j]= ler.nextInt();
        }
         for(i=0;i<10;i++){
            if(X[i][j]<=0){
                X[i][j]=1;
            }
        }
         for(i=0;i<10;i++){
             System.out.printf("X[%d] = %d\n",i,X[i][j]);
            
         }
        
        
    }

}
