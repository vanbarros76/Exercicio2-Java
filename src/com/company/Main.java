package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String nome, nome2;
        nome = "Ana Maria Vasconcelos Neves";
        nome2 = "Eduardo Meireles Rodrigues Cunha";

        System.out.println(nome);
        System.out.println(nome2);

        int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();

        System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres.");
        System.out.println("A variável nome2 tem " + tamanhoDoNome2 + " caracteres.");

        String nomesConcatenados = nome.concat(nome2);
        System.out.println(nomesConcatenados);

        String nomeSemA = nome.replace('a', '9');
        System.out.println(nomeSemA);

        String somenteNome = nome2.substring(6, 11);
        System.out.println(somenteNome);

        String nomeTudoMaiusculo = nome.toUpperCase();
        System.out.println(nomeTudoMaiusculo);

        String nomeTudoMinusculo = nome2.toLowerCase();
        System.out.println(nomeTudoMinusculo);
    }
}
