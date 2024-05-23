public class ExemploForArray {
    public static void main(String[] args) {

        // Em arrays, o índice inicia em ZERO.
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        // For-each
        for(String aluno : alunos) {
            System.out.println("nome do aluno é " + aluno);
        }
    }
}
