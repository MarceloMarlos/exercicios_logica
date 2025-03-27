import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        
        int vogais = 0, consoantes = 0, totalLetras = 0;
        String textoLower = texto.toLowerCase();
        
        for (char c : textoLower.toCharArray()) {
            if (Character.isLetter(c)) {
                totalLetras++;
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        
    
        String[] palavras = texto.trim().split("\\s+");
        int totalPalavras = (texto.trim().isEmpty()) ? 0 : palavras.length;
        
   
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
        System.out.println("Quantidade total de letras: " + totalLetras);
        System.out.println("Quantidade de palavras: " + totalPalavras);
        
        scanner.close();
    }
}
