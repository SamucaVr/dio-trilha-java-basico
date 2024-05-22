import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        System.out.println("Digite a nota do aluno:");
        nota = scanner.nextInt();
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; // Operador ternário simples
        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; // Operador ternário encadeado

        System.out.println(resultado);
        System.out.println(resultado2);
        scanner.close();
    }
}
