import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = "";

        System.out.println("Digite uma letra:");
        letra = scanner.next();

        if (letra.length() > 1) {
            System.out.println("Digite apenas um caracter");
        } else {
            switch (letra) {
                case "p":
                    System.out.println("Tamanho PEQUENO");
                    break;
                case "m":
                    System.out.println("Tamanho MEDIO");
                    break;
                case "g":
                    System.out.println("Tamanho GRANDE");
                    break;
                default:
                    System.out.println("Comando inválido!");
            }
        }
        scanner.close();
    }
}
