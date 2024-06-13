import classe.Iphone;

public class IphoneApplication {

    public static void main(String[] args) {

        var iphone = new Iphone();
        iphone.selecionarMusica("Raridade");
        iphone.tocar();
        iphone.pausar();

        System.out.println("------------------------------------------------------------");

        iphone.ligar("11 76758-3454");
        iphone.iniciarCorreioVoz();

        System.out.println("------------------------------------------------------------");

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.uol.com.br");

    }
}
