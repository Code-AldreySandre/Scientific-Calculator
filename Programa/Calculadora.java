public class Calculadora {

    // Soma dois números reais
    public static double somar(double a, double b) {
        return a + b;
    }

    // Subtrai dois números reais
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica dois números reais
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Divisão de dois números reais
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero.");
        }
        return a / b;
    }

    // Exponenciação 
    public static double exponenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // Divisão inteira 
    public static int divisaoInteira(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão inteira por zero.");
        }
        return a / b;
    }

    // (módulo)
    public static int restoDivisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero para cálculo de resto.");
        }
        return a % b;
    }

    // Fatorial de um número inteiro não-negativo
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Erro: fatorial não definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Arranjos simples: A(n,p) = n! / (n-p)!
    public static long arranjos(int n, int p) {
        if (n < 0 || p < 0 || p > n) {
            throw new IllegalArgumentException("Erro: valores inválidos para arranjos. Requer n ≥ p ≥ 0.");
        }
        return fatorial(n) / fatorial(n - p);
    }

    // Permutações simples: P(n) = n!
    public static long permutacoes(int n) {
        return fatorial(n);  // Reaproveita o método de fatorial
    }

    // Piso (floor)
    public static double piso(double n) {
        return Math.floor(n);
    }

   
    public static double teto(double n) {
        return Math.ceil(n);
    }

    // Raiz n ésima de um número real
    public static double raiz(double base, double grau) {
        if (grau == 0) {
            throw new IllegalArgumentException("Erro: grau da raiz não pode ser zero.");
        }
        if (base < 0 && grau % 2 == 0) {
            throw new IllegalArgumentException("Erro: raiz par de número negativo não é um número real.");
        }
        return Math.pow(base, 1.0 / grau);
    }

    // Verifica se um número inteiro é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Verifica se um número inteiro é um quadrado perfeito
    public static boolean ehQuadradoPerfeito(int n) {
        if (n < 0) return false;
        int raiz = (int) Math.sqrt(n);
        return raiz * raiz == n;
    }
}
