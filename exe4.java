import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro número decimal: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número decimal: ");
        double num2 = scanner.nextDouble();
        
      
        double maior = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        double mmc = (num1 * num2) / mdc((int) num1, (int) num2);
        
      
        System.out.println("O menor múltiplo comum entre " + num1 + " e " + num2 + " é: " + mmc);
        
        scanner.close();
    }
    
    
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
