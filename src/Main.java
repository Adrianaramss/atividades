import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //1 -Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.
        contagemRegressiva();

        //2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.
        tabuada();

        //3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.
        somaDosPares();

        //4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.
        verificarPrimo();

        //5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.
        sequenciaFibonacci();

        //6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o
        // usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.
        calcularMedia();

        //7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração,
        // multiplicação e divisão entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.
        calculadora();

        //8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100,
        // e o jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
        jogoAdivinhacao();

        //9 - Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
        // solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.
        conversorTemperatura();

        //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
        // O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
        // O programa deve continuar executando até que o usuário decida sair.
        listaDeCompras();
    }



    public static void contagemRegressiva() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("contagem..." + i);
        }
    }

    public static void tabuada() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero?");
        int numero = leitura.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void somaDosPares() {
        int soma = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }

    public static void verificarPrimo() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero?");
        int numero = leitura.nextInt();
        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("não é primo.");
        }
    }

    public static void sequenciaFibonacci() {
        int a = 0;
        int b = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void calcularMedia() {
        Scanner leitura = new Scanner(System.in);
        int soma = 0, media = 0 , cont = 0;
        System.out.println("Digite um numero");
        int numero = leitura.nextInt();
        while (numero > 0) { // enquanto
            soma += numero;
            cont ++;
            System.out.println("Digite um numero");
            numero = leitura.nextInt();
        }
        media = soma/cont;
        System.out.println("Media dos numeros são: "+ media);
    }

    public static void calculadora() {
        Scanner leitura = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            int escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    int numero1 = leitura.nextInt();
                    System.out.println("Digite o segundo número:");
                    int numero2 = leitura.nextInt();
                    int soma = numero1 + numero2;
                    System.out.println("Resultado da soma: " + soma);
                    break;

                case 2:
                    System.out.println("Digite o primeiro número:");
                    numero1 = leitura.nextInt();
                    System.out.println("Digite o segundo número:");
                    numero2 = leitura.nextInt();
                    int subtracao = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + subtracao);
                    break;

                case 3:
                    System.out.println("Digite o primeiro número:");
                    numero1 = leitura.nextInt();
                    System.out.println("Digite o segundo número:");
                    numero2 = leitura.nextInt();
                    int multiplicacao = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + multiplicacao);
                    break;

                case 4:
                    System.out.println("Digite o numerador:");
                    double numerador = leitura.nextDouble();
                    System.out.println("Digite o denominador:");
                    double denominador = leitura.nextDouble();
                    if (denominador != 0) {
                        double divisao = numerador / denominador;
                        System.out.println("Resultado da divisão: " + divisao);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;

                case 5:
                    menu = false;
                    System.out.println("Saindo da calculadora.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void jogoAdivinhacao() {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int palpite = 0, tentativas = 10, numerodasorte = random.nextInt(100) + 1;
        System.out.println("---------Vamos iniciar o jogo----------");
        System.out.println("Você deve acertar o numero que o robo esta pensando");
        System.out.println("Voce tera 10 tentativas");
        System.out.println("---------------------------------------");

        for (int i = 5; i > 0; i--) {
            System.out.println("O jogo começará em " + i + " segundos...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (palpite != numerodasorte) {
            System.out.println("---------------------------------------");
            System.out.println("Digite um numero, para voce acertar");
            System.out.println("---------------------------------------");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("---------------------------------------");
                System.out.println("Parabens voce acertou");
                System.out.println("---------------------------------------");
            } else {
                if (palpite > numerodasorte) {
                    System.out.println("Digite um numero menor que o ultimo");
                } else {
                    System.out.println("Digite um numero maior que o ultimo");
                }

                tentativas--;

                System.out.println("Você tem " + tentativas + " tentativas");

                if (tentativas == 0) {
                    System.out.println("Acabou suas tentativas");
                    palpite = numerodasorte;
                }
            }
        }
    }

    public static void conversorTemperatura() {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a conversão de temperatura:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Sair");

            int escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius:");
                    double celsius = leitura.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                    break;

                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    double fahrenheitInput = leitura.nextDouble();
                    double celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
                    System.out.println("A temperatura em Celsius é: " + celsiusOutput);
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saindo do programa de conversão de temperatura.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void listaDeCompras() {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> compras = new ArrayList<>();

        while (true) {
            System.out.println("Digite sua lista de compras (ao finalizar digite 'sair' ):");
            String compra = leitura.nextLine();

            if (compra.equalsIgnoreCase("sair")) {
                break;
            }

            compras.add(compra);
            System.out.println("\nLista de compras atualizada :");
            for (String item : compras) {
                System.out.println(item);
            }
        }
    }
}
