import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
    
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números ímpares recebidos:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        
        scanner.close();
    }
}