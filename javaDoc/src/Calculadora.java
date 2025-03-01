/**
 * <h1>Calculadora</h1>
 * Classe que representa uma calculadora básica com operações de soma, subtração,
 * multiplicação e divisão.
 * 
 * @author Karol
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * 
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma dos dois números.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     * 
     * @param a O primeiro número (minuendo).
     * @param b O segundo número (subtraendo).
     * @return O resultado da subtração.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     * 
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O resultado da multiplicação.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     * 
     * @param a O numerador.
     * @param b O denominador.
     * @return O resultado da divisão.
     * @throws ArithmeticException Se o denominador for zero.
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    /**
     * Método principal para testar a calculadora.
     * 
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma = calc.somar(10, 5);
        System.out.println("Soma: " + soma);

        int subtracao = calc.subtrair(10, 5);
        System.out.println("Subtração: " + subtracao);

        int multiplicacao = calc.multiplicar(10, 5);
        System.out.println("Multiplicação: " + multiplicacao);

        try {
            double divisao = calc.dividir(10, 5);
            System.out.println("Divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}