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
public class Main006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float v = ler.nextFloat();
        int t = ler.nextInt();
        float j = ler.nextFloat();
        System.out.println("Anos"+" "+" Valor Futuro");
        Rendimentos(v,t,j);
        
        
        
    }
    public static float Rendimentos(float v,int t,float j){
        int i;
        float tm = j/12;
        int m = t*12;
        
        for(i=1;i<=m;i++){
            float rend= v*(tm/100);;
            v +=rend;
            if(i%12==0){
                System.out.printf("%d \t %.2f\n",i/12,v);
            }
            
            
        }
        return v;
        
        
    } 
} 
