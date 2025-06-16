/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 16/06/2025
 * @brief class $(name)
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();
        e = ler.nextInt();
        f = ler.nextInt();
        
        System.out.println("");

        int[][] M = new int[a][a];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                M[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%d ", M[i][j]);

            }
            System.out.printf("%n");

        }
        System.out.println("");
        int[][] M2 = new int[b][b];
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                M2[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", M2[i][j]);

            }
            System.out.printf("%n");

        }
        System.out.println("");
        int[][] M3 = new int[c][c];
        
        for (int i = 0; i <c ; i++) {
            for (int j = 0; j < c; j++) {
                M3[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d ", M3[i][j]);

            }
            System.out.printf("%n");

        }
        System.out.println("");
        int[][] M4 = new int[d][d];
        
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                M4[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%d ", M4[i][j]);

            }
            System.out.printf("%n");

        }
        System.out.println("");
        int[][] M5 = new int[e][e];
        
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                M5[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                System.out.printf("%d ", M5[i][j]);

            }
            System.out.printf("%n");

        }
        System.out.println("");
        int[][] M6 = new int[f][f];
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                M6[i][j] = Math.abs(i - j) + 1;
            }

        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                System.out.printf("%d ", M6[i][j]);

            }
            System.out.printf("%n");

        }
        
        
    }
}
