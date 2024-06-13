package interfaces;

public interface AparelhoTelefonico {
    default void ligar(String numero){};
    default void atender(){};
    default void iniciarCorreioVoz(){};
}
