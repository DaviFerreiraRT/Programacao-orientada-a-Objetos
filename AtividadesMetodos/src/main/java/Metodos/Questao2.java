package Metodos;

import java.util.Scanner;

public class Questao2 {

    public static void inverso(String array[]) {
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        String inv[] = new String[5];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < inv.length; i++) {
            inv[i] = ler.nextLine();
        }
        inverso(inv);

    }
}
