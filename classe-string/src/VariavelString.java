public class VariavelString {

    public static void main(String[] args) {
        char[] arrayCarac = {'S', 'a', 'm', 'u', 'e', 'l', ' ', 'V', 'i', 'e', 'i', 'r', 'a'};
        String txt = new String("Samuel Vieira");
        String txt2 = "Samuel Vieira";

        // Três formas de Construtores da classe String
        String texto1 = new String();
        String texto2 = new String(txt);
        String texto3 = new String(arrayCarac);

        System.out.printf("Texto 1 = %s%nTexto 2 = %s%nTexto 3 = %s", texto1, texto2, texto3);
    
        // Método da classe String: Comprimento da string
        System.out.printf("%nComprimento da string txt: %d Caracteres", txt.length());
        
        // Método da classe String: getChars: Permite criar um array de caracteres apartir de uma string.
        char[] arrayChars = new char[6];
        txt.getChars(0, 6, arrayChars, 0); // .getChars(índice inicial a ser copiado, ponto de parada, nome da variável que vai receber o array de caracteres, índice inicial que vai receber os caracteres)
        System.out.printf("%nO array de caracteres criado é: ");
        
        for (char caractere : arrayChars) {
            System.out.print(caractere);
        }

        // Método da classe String: charAt: Pega caracteres individuais;
        System.out.printf("%nCaractere de índice 0 em arrayCarac: %c%n", texto3.charAt(0)); // .charAt(índice do array).

        // Mostrando uma frase reversa usando charAt
        System.out.printf("String texto3 de trás para frente: ");
        for (int contador = texto3.length() - 1; contador >= 0; contador--) {
            System.out.printf("%c", texto3.charAt(contador));
        }
    }
}
