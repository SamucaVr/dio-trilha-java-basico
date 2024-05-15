public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Variáveis primitivas

        byte numeroPequeno; // Valor mínimo: -128; Valor máximo: 127.
        short numeroCurto; // Valor mínimo: -32.768; Valor máximo: 32.767.
        int numeroNormal; // Valor mínimo: -2.147.483.648; Valor máximo: 2.147.483.647.
        long numeroLongo; // Valor mínimo: -9.223.372.036.854.775.808; Valor máximo: 9.223.372.036.854.775.807.

        // Variáveis primitivas com valores fracionárias.

        float numeroFlutuante = 3.14f; // Valor mínimo: -3,4028E + 38; Valor máximo: 3,4028E + 38; Precisão: 6 - 7 dígitos.
        double numeroDuplo = 3.14; // Valor mínimo: -1,7976E + 308; Valor máximo: 1,7976E + 308; Precisão: 15 dígitos.
    
        // Variáveis primitivas com valores lógicos
        boolean verdadeiro = true; // Os valores podem ser: true ou false.

        // Variáveis primitivas com Caracteres
        char umaLetra = 'a'; // Char é capaz de armazenar apenas um caracter, possui o mesmo tamanho da variáveis tipo Short.
    
        // Variável Cadeia de caracteres
        String meuNome = "Samuel"; // Valor mínimo: 0; Valor máximo: 2147483647.
    }
}
