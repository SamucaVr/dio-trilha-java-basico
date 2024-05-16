import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        Scanner input = new Scanner(System.in);
        int opcao =  0;

        do {
            smartTv.menu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    smartTv.ligarTv();
                break;
                case 2:
                    smartTv.desligarTv();
                break;
                case 3:
                    smartTv.aumentarVolume();
                break;
                case 4:
                    smartTv.diminuirVolume();
                break;
                case 5:
                    smartTv.proximoCanal();
                break;
                case 6:
                    smartTv.anteriorCanal();
                break;
                case 7:
                    System.out.println("Desligando sistema...");
                default:
                    System.out.println("Comando inválido!");
            }
        } while (opcao != 7);
        input.close();
    }
}
