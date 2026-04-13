package smarthome;

public class FechaduraEletronica extends Dispositivo implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta;
    private boolean acessoLiberado = false;

    public FechaduraEletronica(String nome, String senhaCorreta) {
        super(nome);
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            acessoLiberado = true;
            System.out.println("Acesso liberado!");
        } else {
            acessoLiberado = false;
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        if (acessoLiberado) {
            System.out.println("Fechadura destrancada.");
        } else {
            System.out.println("Acesso negado. Não é possível destrancar.");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Fechadura trancada.");
    }
}
