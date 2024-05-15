public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 6;
        String resultado = "";

        // Comparação usando if e else.
        if (a ==b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        System.out.println(resultado);

        // Comparação usando operador ternário.
        resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
