import java.util.Locale; // Usada para representar uma região geográfica. É frequentemente utilizada para formatação de datas, números ou moedas.
import java.util.Scanner; // Usado para receber entrada de dados do usuário

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite O seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.printf("Olá, %s %s%n", nome, sobrenome);
        System.out.printf("Você tem %d anos e %.2fcm", idade, altura);

        scanner.close();
    }   
}
