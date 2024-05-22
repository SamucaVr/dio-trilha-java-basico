import java.util.Scanner;

public class PlanoTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("Escolha uma opcão:");
        System.out.printf("[1] Plano TURBO %n[2] Plano MIDIA %n[3] Plano BASIC%n");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("5Gb Youtube");
            case 2:
                System.out.println("WhatsApp + Intagram grátis");    
            case 3:
                System.out.println("100 minutos de ligação");
            break;
            default:
                System.out.println("Comando inválido");
        }
        scanner.close();
    }
}
