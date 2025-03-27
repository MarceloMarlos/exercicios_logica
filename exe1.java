import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número decimal: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número decimal: ");
        double num2 = scanner.nextDouble();
        
    
        if (num1 == 0 || num2 == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } else {
            double maior = Math.max(num1, num2);
            double menor = Math.min(num1, num2);
            double resultado = maior / menor;
            
            System.out.println("O resultado da divisão do maior pelo menor é: " + resultado);
        }
        
        scanner.close();
    }
}
