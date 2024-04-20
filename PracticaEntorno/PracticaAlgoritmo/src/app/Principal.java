package app;

import util.Algoritmos;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
        // Crear un array de enteros con 5 números aleatorios del 1 al 10
        int[] numeros = new int[5];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }
        
        // Calcular el número de Fibonacci de los números del array y almacenar los resultados
        int[] resultadoFibonacci = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
        
        // Calcular el factorial de los números del array y almacenar los resultados
        int[] resultadoFactorial = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
        
        // Comprobar si los números del array son primos y almacenar los resultados
        boolean[] resultadoPrimos = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }
        
     
    }
}
