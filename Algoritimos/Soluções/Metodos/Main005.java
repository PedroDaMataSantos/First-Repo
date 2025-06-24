/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xamax
 * @date 24/06/2025
 * @brief class $(name)
 *
 */
public class Main005 {

    public static void main(String[] args) {
        int p=1;
        int cont = 4;
        int[][] M = new int[5][10];

       
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    if( p<=3725) {
                    M[i][j] = p;
                    p = p + cont;
                    cont = cont + 3;

                }else{
                        break;

            }
                }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(M[i][j] + " ");
            }
                System.out.printf("%n");

            }

        }

    }

