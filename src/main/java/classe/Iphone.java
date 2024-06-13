package classe;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("No momento não posso atender :(,  por favor ligar mais tarde");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}
