package Metodos;

import java.util.Scanner;

public class Conversor {

    public static double centToFar(double cen) {
        double fah = 1.8 * cen + 32;
        return fah;
    }

    public static double farToCent(double fah) {
        double cent = (fah - 32) * 5 / 9;

        return cent;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha = 1;
        while (escolha != 0) {

            System.out.print("\n1-Converter para centrigrados" + "\n2-Converter para fahrenheit"
                    + "\n\n0-Encerrar o programa\nDigite a sua opção: ");
            escolha = ler.nextInt();
            if (escolha == 1) {
                System.out.print("Digite o valor em fahrenheit: ");
                double fah = ler.nextDouble();
                double result = farToCent(fah);
                System.out.print("A conversão de " + fah + "°F para centrigrados eh: " + result + "°C");

            }
            if (escolha == 2) {
                System.out.println("Digite o valor em centigrados: ");
                double cen = ler.nextDouble();
                double result = centToFar(cen);
                System.out.println("A conversão de " + cen + "°C para fahrenheit eh: " + result + "°F");

            }
            if (escolha != 0 && escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida!");
            }
            if (escolha == 0) {
                System.out.println("Encerrando o programa...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Programa Encerrado ");
            }
        }
    }
}
