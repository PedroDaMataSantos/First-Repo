/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 24/06/2025
 * @brief class $(name)

 */
public class Main004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        int resultado = SomaDigitos(n);
        System.out.println(resultado);


    }
    public static int SomaDigitos (int n){
        int d,sd = 0;
        while(n>0){
            d=n%10;
            sd +=d;
            n/=10;
        }

        return sd;
            
       
       
        
    }


}
