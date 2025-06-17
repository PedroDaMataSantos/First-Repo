

import java.util.Scanner;

public class Main004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        String O;
        O = ler.next();
        double soma = 0; 
        double count = 0; 

        double[][] M = new double[12][12]; 

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                M[i][j] = ler.nextDouble(); 
            }
        }

        
        for (i = 1; i < 6; i++) { 
            for (j = 11; j >=12 - i; j--) { 
                soma += M[i][j];
                count++;
            }
        }

        
        for (i = 6; i < 11; i++) { 
            for (j = 11; j > i; j--) { 
                soma += M[i][j];
                count++;
            }
        }

        
        if (O.equals("S")) { 
            System.out.printf("%.1f\n", soma); 
        } else if (O.equals("M")) { 
            System.out.printf("%.1f\n", soma / count); 
        }

      
    }
}