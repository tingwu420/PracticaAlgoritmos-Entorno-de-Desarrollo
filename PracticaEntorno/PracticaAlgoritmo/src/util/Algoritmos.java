package util;

public abstract class Algoritmos {
	/**
	 * Calcula el número de Fibonacci de un número entero.
	 * 
	 * @param numero El número entero del cual calcular el número de Fibonacci.
	 * @return El número de Fibonacci del número dado.
	 */
	public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
	
	/**
	 * Calcula el factorial de un número entero.
	 * 
	 * @param numero El número entero del cual calcular el factorial.
	 * @return El factorial del número dado.
	 */
	public static int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
	
	/**
	 * Verifica si un número entero es primo.
	 * 
	 * @param numero El número entero a verificar.
	 * @return true si el número es primo, false de lo contrario.
	 */
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        int divisor = 5;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0 || numero % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }
        return true;
    }
}
