public class ExemploTryCatch {
    public static void main(String[] args) {
        try { // Try -> tentar
            // Ele vai tentar executar
            int numeros[] = new int[] {1, 2, 3, 4};
            System.out.println("Números: ");
            System.out.println(numeros[5]);
        } catch (Exception erro) { // Catch -> capturar
            // Tratar os erros capturados no bloco try
            // Imprimir no console o erro que aconteceu
            // Criar um arquivo de log
            System.out.println(erro.getMessage());
        }
        System.out.println("Mensagem final");
    }
}
