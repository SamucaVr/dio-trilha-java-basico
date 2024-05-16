public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligarTv() {
        if (ligada) {
            System.out.println("A Tv já está ligada!");
        } else {
            ligada = true;
        }
    }

    public void desligarTv() {
        if (!ligada) {
            System.out.println("A Tv já está desligada!");
        } else {
            ligada = false;
        }
    }

    public void aumentarVolume() {
        if (volume < 10) {
            if (ligada) {
                ++volume;
            } else {
                System.out.println("Precisa ligar a Tv antes!");
            }
        } else {
            System.out.println("Volume máximo!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            if (ligada) {
                volume--;
            } else {
                System.out.println("Precisa ligar a Tv antes!");
            }
        } else {
            System.out.println("Volume mínimo!");
        }
    }

    public void proximoCanal() {
        if (ligada) {
            canal++;
        } else {
            System.out.println("Precisa ligar a Tv antes!");
        }
    }

    public void anteriorCanal() {
        if (ligada) {
            canal--;
        } else {
            System.out.println("Precisa ligar a Tv antes!");
        }
    }

    public void menu() {
        System.out.println("A TV está ligada? " + ligada);
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal);
        System.out.printf("[1] Ligar TV%n[2] Desligar TV%n[3] Aumentar Volume%n[4] Diminuir Volume%n[5] Aumentar Canal%n[6] Diminuir Canal%n[7] Sair%n");
    }
}
