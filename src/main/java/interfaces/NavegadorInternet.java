package interfaces;

public interface NavegadorInternet {
    default void exibirPagina(String url){};
    default void adicionarNovaAba(){};
    default void atualizarPagina(){};
}
