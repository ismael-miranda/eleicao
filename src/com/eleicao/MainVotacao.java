package com.eleicao;

import java.util.Scanner;

public class MainVotacao {

    public static void main(String[] args) {

        Candidato c01 = new Candidato();
        c01.setNome("Honorio");
        c01.setPartido("Associação Brasileira Comum");
        c01.setSigla("ABC");
        c01.setNumPartido(77);

        Candidato c02 = new Candidato();
        c02.setNome("Zaragoza");
        c02.setPartido("Partido Honesto Nacional");
        c02.setSigla("PHC");
        c02.setNumPartido(88);

        Candidato c03 = new Candidato();
        c03.setNome("Journey");
        c03.setPartido("Fazemos Qualquer Negócio");
        c03.setSigla("FQN");
        c03.setNumPartido(99);


        int eleitor = 9;

        while (1 <= eleitor) {
            System.out.println("==============================================");
            System.out.println("Bem-Vindo ao Colégio Eleitoral - Sessao 1");
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("CASO NÃO TENHA MAIS ELEITORES DIGITE 0");
            System.out.println("_______________________________________________\n");

            Scanner votacao = new Scanner(System.in);
            System.out.print("Informe o numero do titulo de eleitor(X): ");
            int numTitulo = votacao.nextInt();

            if (numTitulo == 0) {
                break;
            } else {
                if (numTitulo < 1 || numTitulo > 9) {
                    System.out.println("Essa não é sua sessão eleitoral. Favor, se direcione a sessão correta");
                } else {
                    System.out.print("Numero Candidato: ");
                    int numCand = votacao.nextInt();
                    switch (numCand) {
                        case 77:
                            c01.somaVotos();
                            System.out.println("Voto confirmado\n");
                            break;
                        case 88:
                            c02.somaVotos();
                            System.out.println("Voto confirmado\n");
                            break;
                        case 99:
                            c03.somaVotos();
                            System.out.println("Voto confirmado\n");
                            break;
                        default:
                            System.out.println("Número inválido.\n");
                            break;
                    }

                }
            }

            eleitor--;
        }

        System.out.println("Resultado da votação: ");
        System.out.println(c01.msg());
        System.out.println(c02.msg());
        System.out.println(c03.msg());

    }

}

