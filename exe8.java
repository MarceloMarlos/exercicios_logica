import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
     
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 9; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}
