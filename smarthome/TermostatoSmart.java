package smarthome;

public class TermostatoSmart extends Dispositivo implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado = false;

    public TermostatoSmart(String nome) {
        super(nome);
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            return 25.0;
        } else {
            System.out.println("Termostato desligado.");
            return 0.0;
        }
    }
}
