package smarthome;

public abstract class Dispositivo {
    protected String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Dispositivo: " + nome);
    }
}
