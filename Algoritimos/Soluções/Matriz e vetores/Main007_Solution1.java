/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */


import java.util.Scanner;

/**
 * 
 *  *
 * 
 *  * @author xamax
 * 
 *  * @date 22/07/2025
 * 
 *  * @brief class $(name)
 * 
 *  *
 * 
 *  
 */

public class Main007_Solution1 {

  
    public static void main(String[] args) {

 Scanner ler = new Scanner(System.in);

 String op = ler.next();

 int k = 0, i, j, a = 12;

 double s = 0, med = 0;

 double[][] M = new double[a][a];



 for (i = 0; i < M.length; i++) {

 for (j = 0; j < M.length; j++) {

 M[i][j] = ler.nextDouble();

}



 }

 for (i = 0; i < M.length / 2 - 1; i++) {
 for (j = i + 1; j < M.length - (i + 1); j++) {
 s += M[i][j];

 k++;
 }



}



 if (op.equalsIgnoreCase("S")) {

 System.out.printf("%.1f\n", s);

}

if (op.equalsIgnoreCase("M")) {

 med = s / k;

 System.out.printf("%.1f\n", med);

 }


ler.close();
 }

}