package com.company.application;

import com.company.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  throws ParseException {
        Locale.setDefault(Locale.US);
        aula6();
    }


    public static void aula6() throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Date y1 = sdf1.parse("25/08/2018");
        Date y2 = sdf1.parse("25/08/2018 15:42:07");

        System.out.println(y1);
        System.out.println(y2);

        System.out.println(sdf2.format(y1));
        System.out.println(sdf1.format(y2));
    }

    public static void aula5(){

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int l=0; l<matriz.length; l++){
            for (int c=0; c< matriz[l].length; c++){
                matriz[l][c] = sc.nextInt();
            }
        }
    }


    public static void aula4(){

        List<String> list = new ArrayList<>();

        list.add("Leonor José");
        list.add("Judson Paiva");
        list.add("Barbás Sebastião");
        list.add("Quissanga Coge");

        for (String valor: list) {
            System.out.println(valor);
        }

        System.out.println("\nDepois de alterado... \n");

        list.add(2, "Leonor & Judson");
        list.remove("Quissanga Coge");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'L');

        for (String valor: list) {
            System.out.println(valor);
        }

        list.add("Leonor José");
        list.add("Judson Paiva");
        list.add("Barbás Sebastião");
        list.add("Quissanga Coge");
        list.add(2, "Leonor & Judson");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toUnmodifiableList());

        System.out.println("Resultante");
        for (String valor: result) {
            System.out.println(valor);
        }
    }



    public static void aula3(){

        String[] termos = new String[]{""};

        int x = 20;
        Object obj = x;
    }

    public static void aula2(){

        int n = sc.nextInt();
        Product[] produtos = new Product[n];

        for(int i=0; i<n; i++){
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            produtos[i] = new Product(nome, price);

            sc.nextLine();
        }
    }

    public static void aula1(){

        int n = sc.nextInt();
        double[] lista = new double[n];

        for(int i=0; i<n; i++){
            lista[i] = sc.nextInt();
        }

        System.out.println("imprimindo");

        for(int i=0; i<n; i++){
            System.out.println(lista[i]);
        }
    }
}
