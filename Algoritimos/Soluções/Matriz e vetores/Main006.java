/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 21/07/2025
 * @brief class $(name)
 *
 */
public class Main006 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double [][] M = new double [12][12];
        String op = ler.next();
        int i, j;
        float s = 0, k = 0;
        for (i = 0; i < M.length; i++) {
            for (j = 0; j < M.length; j++) {
                M[i][j] = ler.nextDouble();
            }
        }
        for (i = 0; i < M.length; i++) {
            for (j = M.length - 1; j > i; j--) {
                s += M[i][j];
                k++;

            }

        }
        if (op.equalsIgnoreCase("S")) {
            System.out.printf("%.1f\n", s);

        }
        if (op.equalsIgnoreCase("M")) {
            float med = s / k;
            System.out.printf("%.1f\n", med);
        }
        ler.close();
    }
}
