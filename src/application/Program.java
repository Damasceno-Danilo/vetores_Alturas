package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros serao digitados? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] heigth = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            heigth[i] = sc.nextDouble();

        }
        int menores = 0;
        double alturaTotal = 0.0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                menores++;
            }
                alturaTotal += heigth[i];

            }

            double pmenores;

            double media = alturaTotal / n;
            pmenores = (double) menores / n * 100;
            System.out.printf("Altura media %.2f%n", media);
            System.out.printf("Pessoas com menos de 16 anos : %.1f%n", pmenores);



            for (int i = 0; i < n; i++) {
                if (age[i] < 16) {
                    System.out.printf("%s\n", name[i]);

                }

            }


            sc.close();
        }
    }
