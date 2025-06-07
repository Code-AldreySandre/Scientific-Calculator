import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== CALCULADORA INTERATIVA ===");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Exponenciação");
            System.out.println("6. Divisão inteira");
            System.out.println("7. Resto da divisão");
            System.out.println("8. Fatorial");
            System.out.println("9. Arranjos");
            System.out.println("10. Permutações");
            System.out.println("11. Piso");
            System.out.println("12. Teto");
            System.out.println("13. Raiz de grau n");
            System.out.println("14. Verificar número primo");
            System.out.println("15. Verificar quadrado perfeito");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite dois números: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.somar(a, b));
                    }
                    case 2 -> {
                        System.out.print("Digite dois números: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.subtrair(a, b));
                    }
                    case 3 -> {
                        System.out.print("Digite dois números: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.multiplicar(a, b));
                    }
                    case 4 -> {
                        System.out.print("Digite dois números: ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.dividir(a, b));
                    }
                    case 5 -> {
                        System.out.print("Digite base e expoente: ");
                        double base = scanner.nextDouble();
                        double exp = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.exponenciar(base, exp));
                    }
                    case 6 -> {
                        System.out.print("Digite dois inteiros: ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println("Resultado: " + Calculadora.divisaoInteira(a, b));
                    }
                    case 7 -> {
                        System.out.print("Digite dois inteiros: ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println("Resto: " + Calculadora.restoDivisao(a, b));
                    }
                    case 8 -> {
                        System.out.print("Digite um número inteiro: ");
                        int n = scanner.nextInt();
                        System.out.println("Fatorial: " + Calculadora.fatorial(n));
                    }
                    case 9 -> {
                        System.out.print("Digite n e p (n ≥ p): ");
                        int n = scanner.nextInt();
                        int p = scanner.nextInt();
                        System.out.println("Arranjos: " + Calculadora.arranjos(n, p));
                    }
                    case 10 -> {
                        System.out.print("Digite n: ");
                        int n = scanner.nextInt();
                        System.out.println("Permutações: " + Calculadora.permutacoes(n));
                    }
                    case 11 -> {
                        System.out.print("Digite um número: ");
                        double x = scanner.nextDouble();
                        System.out.println("Piso: " + Calculadora.piso(x));
                    }
                    case 12 -> {
                        System.out.print("Digite um número: ");
                        double x = scanner.nextDouble();
                        System.out.println("Teto: " + Calculadora.teto(x));
                    }
                    case 13 -> {
                        System.out.print("Digite o número e o grau da raiz: ");
                        double base = scanner.nextDouble();
                        double grau = scanner.nextDouble();
                        System.out.println("Resultado: " + Calculadora.raiz(base, grau));
                    }
                    case 14 -> {
                        System.out.print("Digite um número inteiro: ");
                        int n = scanner.nextInt();
                        System.out.println("É primo? " + Calculadora.ehPrimo(n));
                    }
                    case 15 -> {
                        System.out.print("Digite um número inteiro: ");
                        int n = scanner.nextInt();
                        System.out.println("É quadrado perfeito? " + Calculadora.ehQuadradoPerfeito(n));
                    }
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine();  // limpa entrada inválida
            }
        }

        scanner.close();
    }
}
