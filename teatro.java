import java.util.Scanner;

public class teatro {

    static Scanner sc = new Scanner(System.in);

    static final int LINHAS = 12;
    static final int COLUNAS = 12;

    // Estrutura geral
    static class Sala {
        String nome;
        String espetaculo;
        double precoInteira;
        char[][] cadeiras = new char[LINHAS][COLUNAS];

        public Sala(String nome, String espetaculo, double preco) {
            this.nome = nome;
            this.espetaculo = espetaculo;
            this.precoInteira = preco;

            for (int i = 0; i < LINHAS; i++) {
                for (int j = 0; j < COLUNAS; j++) {
                    cadeiras[i][j] = 'L';
                }
            }
        }
    }

    // salas
    static Sala[] salas = {
        new Sala("Sala 1", "Harry Potter e o Prisioneiro de Azkaban", 100),
        new Sala("Sala 2", "Harry Potter e a Pedra Filosofal", 80),
        new Sala("Sala 3", "Percy Jackson e o Ladrão de Raios", 70)
    };

    static int salaAtual = 0;

    static Sala getSala() {
        return salas[salaAtual];
    }

    // menu principal
    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== TEATRO DEVISATE =====");
            System.out.println("Sala atual: " + salas[salaAtual].nome);
            System.out.println("1 - Ver mapa da sala");
            System.out.println("2 - Reservar cadeira");
            System.out.println("3 - Comprar cadeira");
            System.out.println("4 - Cancelar reserva");
            System.out.println("5 - Relatório financeiro");
            System.out.println("6 - Escolher sala");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> mostrarMapa();
                case 2 -> reservar();
                case 3 -> comprar();
                case 4 -> cancelar();
                case 5 -> relatorio();
                case 6 -> escolherSala();
            }

        } while (opcao != 0);
    }

    // escolher sala
    static void escolherSala() {
        System.out.println("\nEscolha a sala:");

        for (int i = 0; i < salas.length; i++) {
            System.out.println(i + " - " + salas[i].nome + " (" + salas[i].espetaculo + ")");
        }

        int escolha = sc.nextInt();

        if (escolha >= 0 && escolha < salas.length) {
            salaAtual = escolha;
            System.out.println("Sala selecionada: " + salas[salaAtual].nome);
        } else {
            System.out.println("Sala inválida!");
        }
    }

    // mapinha
    static void mostrarMapa() {
        Sala s = getSala();

        System.out.println("\nSALA: " + s.nome);
        System.out.println("ESPETÁCULO: " + s.espetaculo);

        System.out.print("    ");
        for (int j = 1; j <= COLUNAS; j++) {
            System.out.printf("%3d ", j);
        }
        System.out.println();

        int livres = 0, reservadas = 0, ocupadas = 0;

        for (int i = 0; i < LINHAS; i++) {
            System.out.print((char) ('A' + i) + "  ");

            for (int j = 0; j < COLUNAS; j++) {
                char c = s.cadeiras[i][j];

                String simbolo = (c == 'L') ? "[ ]" : (c == 'R') ? "[R]" : "[X]";
                System.out.print(simbolo + " ");

                if (c == 'L') livres++;
                else if (c == 'R') reservadas++;
                else ocupadas++;
            }
            System.out.println();
        }

        System.out.println("\nLivres: " + livres +
                " | Reservadas: " + reservadas +
                " | Ocupadas: " + ocupadas);
    }

    // entrada
    static int linha() {
        System.out.print("Linha (A-L): ");
        char l = sc.next().toUpperCase().charAt(0);
        return l - 'A';
    }

    static int coluna() {
        System.out.print("Coluna (1-12): ");
        return sc.nextInt() - 1;
    }

    // reservar
    static void reservar() {
        Sala s = getSala();

        int i = linha();
        int j = coluna();

        if (i < 0 || i >= LINHAS || j < 0 || j >= COLUNAS) {
            System.out.println("Posição inválida!");
            return;
        }

        if (s.cadeiras[i][j] == 'L') {
            s.cadeiras[i][j] = 'R';
            System.out.println("Reservado! Valor: " + (s.precoInteira * 0.5));
        } else {
            System.out.println("Cadeira indisponível!");
        }
    }

    // comprar
    static void comprar() {
        Sala s = getSala();

        int i = linha();
        int j = coluna();

        if (i < 0 || i >= LINHAS || j < 0 || j >= COLUNAS) {
            System.out.println("Posição inválida!");
            return;
        }

        if (s.cadeiras[i][j] == 'L') {
            s.cadeiras[i][j] = 'X';
            System.out.println("Compra realizada! Valor: " + s.precoInteira);
        } else if (s.cadeiras[i][j] == 'R') {
            s.cadeiras[i][j] = 'X';
            System.out.println("Compra confirmada! Valor restante: " + (s.precoInteira * 0.5));
        } else {
            System.out.println("Já está ocupada!");
        }
    }

    // cancelar
    static void cancelar() {
        Sala s = getSala();

        int i = linha();
        int j = coluna();

        if (i < 0 || i >= LINHAS || j < 0 || j >= COLUNAS) {
            System.out.println("Posição inválida!");
            return;
        }

        if (s.cadeiras[i][j] == 'R') {
            s.cadeiras[i][j] = 'L';
            System.out.println("Reserva cancelada. Reembolso: " + (s.precoInteira * 0.5));
        } else {
            System.out.println("Não é possível cancelar!");
        }
    }

    // relatório
    static void relatorio() {
        Sala s = getSala();

        int livres = 0, reservadas = 0, ocupadas = 0;
        double total = 0, reservas = 0;

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                char c = s.cadeiras[i][j];

                if (c == 'L') livres++;
                else if (c == 'R') {
                    reservadas++;
                    reservas += s.precoInteira * 0.5;
                } else {
                    ocupadas++;
                    total += s.precoInteira;
                }
            }
        }

        double potencialReservas = total + reservas;
        double potencialMax = potencialReservas + (livres * s.precoInteira);

        System.out.println("\n===== RELATÓRIO =====");
        System.out.println("Livres: " + livres);
        System.out.println("Reservadas: " + reservadas);
        System.out.println("Ocupadas: " + ocupadas);
        System.out.println("Total arrecadado: " + total);
        System.out.println("Total em reservas: " + reservas);
        System.out.println("Receita potencial (reservas): " + potencialReservas);
        System.out.println("Receita máxima: " + potencialMax);
    }
}
