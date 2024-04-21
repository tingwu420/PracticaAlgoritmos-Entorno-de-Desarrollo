package util;

public abstract class Algoritmos {
	/**
	 * Calcula el número de Fibonacci de un número entero.
	 * 
	 * @param numero El número entero del cual calcular el número de Fibonacci.
	 * @return El número de Fibonacci del número dado.
	 */
	public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
	
	/**
	 * Calcula el factorial de un número entero.
	 * 
	 * @param numero El número entero del cual calcular el factorial.
	 * @return El factorial del número dado.
	 */
	public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
	
	/**
	 * Verifica si un número entero es primo.
	 * 
	 * @param numero El número entero a verificar.
	 * @return true si el número es primo, false de lo contrario.
	 */
	public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int divisor = 5;
        while (divisor * divisor <= num) {
            if (num % divisor == 0 || num % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }
        return true;
    }
}
