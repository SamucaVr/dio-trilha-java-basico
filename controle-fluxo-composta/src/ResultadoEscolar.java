import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        System.out.println("Digite a nota do aluno: ");
        nota = scanner.nextInt();
        scanner.close();

        if(nota >= 7 ) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
