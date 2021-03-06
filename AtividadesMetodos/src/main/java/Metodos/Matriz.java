package Metodos;

import java.util.Scanner;

public class Matriz {

    public static int contador(int linhas, int colunas, int matriz[][]) {
        int cont = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] % 3 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade de linhas: ");
        int linhas = scan.nextInt();
        System.out.print("Quantidade de Colunas: ");
        int colunas = scan.nextInt();
        System.out.println("Digite os valores para adicionar na matriz ");
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("O total de multiplos de 3 � igual a: " + contador(linhas, colunas, matriz));
    }
}
