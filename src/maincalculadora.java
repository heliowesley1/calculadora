
import java.util.Scanner;

public class maincalculadora {
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida!");
            return Double.NaN;
        }
        return a / b;
    }

    public int fatorial(int x) {
        if (x < 0) {
            System.out.println("Erro: Fatorial não definido para números negativos.");
            return -1;
        }
        int resultado = 1;
        for (int i = 1; i <= x; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double exponencial(double base, int expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double x) {
        if (x < 0) {
            System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
            return Double.NaN;
        }
        return Math.sqrt(x);
    }

    public int fibonacci(int i) {
        if (i < 0) {
            System.out.println("Erro: O índice de Fibonacci não pode ser negativo.");
            return -1;
        }
        if (i == 0) return 0;
        if (i == 1) return 1;
        int a = 0, b = 1, c;
        for (int j = 2; j <= i; j++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nSelecione uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Fatorial");
            System.out.println("6. Exponencial");
            System.out.println("7. Raiz Quadrada");
            System.out.println("8. Fibonacci");
            System.out.println("9. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 9) {
                System.out.println("Saindo do console");
                break;
            }
            double a, b, resultado;
            int i, fatorialResult;
            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    a = scanner.nextDouble();
                    System.out.print("Somar com: ");
                    b = scanner.nextDouble();
                    resultado = soma(a, b);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    a = scanner.nextDouble();
                    System.out.print("Subtrair por: ");
                    b = scanner.nextDouble();
                    resultado = subtracao(a, b);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    System.out.print("Digite um número: ");
                    a = scanner.nextDouble();
                    System.out.print("Multiplicar por: ");
                    b = scanner.nextDouble();
                    resultado = multiplicacao(a, b);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    System.out.print("Digite o numerador: ");
                    a = scanner.nextDouble();
                    System.out.print("Digite o denominador: ");
                    b = scanner.nextDouble();
                    resultado = divisao(a, b);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
                case 5:
                    System.out.print("Digite um número para calcular o fatorial: ");
                    i = scanner.nextInt();
                    fatorialResult = fatorial(i);
                    if (fatorialResult != -1) {
                        System.out.println("Resultado do fatorial de " + i + ": " + fatorialResult);
                    }
                    break;
                case 6:
                    System.out.print("Digite a base: ");
                    a = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    i = scanner.nextInt();
                    resultado = exponencial(a, i);
                    System.out.println("Resultado da exponenciação: " + resultado);
                    break;
                case 7:
                    System.out.print("Digite um número para calcular a raiz quadrada: ");
                    a = scanner.nextDouble();
                    resultado = raizQuadrada(a);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado da raiz quadrada: " + resultado);
                    }
                    break;
                case 8:
                    System.out.print("Digite o índice para o número de Fibonacci: ");
                    i = scanner.nextInt();
                    resultado = fibonacci(i);
                    if (resultado != -1) {
                        System.out.println("O número de Fibonacci no índice " + i + " é: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);
        scanner.close();
    }

    public static void main(String[] args) {
        maincalculadora calculadora = new maincalculadora();
        calculadora.exibirMenu();
    }
}
