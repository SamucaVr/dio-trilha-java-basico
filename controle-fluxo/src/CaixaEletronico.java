public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double saldoSolicitado = 17;

        if(saldoSolicitado < saldo) {
            saldo -=  saldoSolicitado;
        } else {
            System.out.println("Erro! Saldo não disponível para saque");
        }

        System.out.println(saldo);
    }
}
