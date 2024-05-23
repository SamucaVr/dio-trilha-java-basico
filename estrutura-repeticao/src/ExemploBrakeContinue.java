public class ExemploBrakeContinue {
    public static void main(String[] args) {

        // Exemplo usado breake
        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3) {
                break;
            }
            System.out.printf(" %d%n", numero);
        }

        // Exemplo usando continue
        for(int numero = 1; numero <= 5;  numero++) {
            if(numero == 3) {
                continue;
            }
            System.out.println(numero);
        }
    }
}
