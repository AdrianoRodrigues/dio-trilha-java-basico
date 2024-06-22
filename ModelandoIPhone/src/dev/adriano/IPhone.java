package dev.adriano;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musica = "";

    @Override
    public void pausar() {
        System.out.println("Pausando musica no iphone");
    }

    @Override
    public void tocar() {
        if (this.musica.isEmpty()) {
            System.out.println("Favor selecionar uma musica!");
            return;
        }
        System.out.println("Tocando musica: " + this.musica + " no iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Selecionando musica: " + musica + " no iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero + " no iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina no iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no iphone");
    }
}
