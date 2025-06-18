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
public class Main002{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int j, i, x = 0;

        int[][] m = new int[n][3];

        for (i = 0; i < n; i++) {
            for (j = 0; j < 3; j++) {
                m[i][j] = (x + 1);
                x++;
                if (j == 2) {
                    x = x + 1;
                }
            }

        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.print(m[i][j] + " PUM");
                    System.out.printf("%n");
                    break;
                }
                System.out.printf("%d ", m[i][j]);

            }


        }

    }
}
