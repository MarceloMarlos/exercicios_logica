import java.util.Arrays;
import java.util.Scanner;

public class SequenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a quantidade de números
        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        int somaPares = 0, somaImpares = 0, somaTotal = 0;
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        // Solicita os números ao usuário
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
            somaTotal += numeros[i];

            // Verifica o maior e menor número
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];

            // Soma os números pares e ímpares
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            } else {
                somaImpares += numeros[i];
            }
        }
        
        // Calcula a média
        double media = somaTotal / (double)n;

        // Ordena os números em ordem crescente e decrescente
        int[] numerosCrescente = Arrays.copyOf(numeros, n);
        Arrays.sort(numerosCrescente);
        int[] numerosDecrescente = Arrays.copyOf(numeros, n);
        Arrays.sort(numerosDecrescente);
        for (int i = 0; i < n / 2; i++) {
            int temp = numerosDecrescente[i];
            numerosDecrescente[i] = numerosDecrescente[n - i - 1];
            numerosDecrescente[n - i - 1] = temp;
        }

        // Exibe os resultados
        System.out.println("Números em ordem crescente:");
        for (int num : numerosCrescente) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Números em ordem decrescente:");
        for (int num : numerosDecrescente) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + somaTotal);
        System.out.println("Média dos números: " + media);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scanner.close();
    }
}