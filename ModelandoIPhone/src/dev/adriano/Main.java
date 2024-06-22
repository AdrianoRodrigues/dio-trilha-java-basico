package dev.adriano;

public class Main {
    public static void main(String[] args) {

        IPhone meuIphone = new IPhone();

        meuIphone.ligar("098 12345-6789");
        meuIphone.atender();

        meuIphone.selecionarMusica("November Rain");
        meuIphone.tocar();
    }
}