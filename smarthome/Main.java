package smarthome;

public class Main {
    public static void main(String[] args) {

        FechaduraEletronica fechadura = new FechaduraEletronica("Porta Principal", "1234");

        fechadura.mostrarNome();
        fechadura.validarAcesso("1234");
        fechadura.ligar();
        fechadura.desligar();

        System.out.println();

        TermostatoSmart termostato = new TermostatoSmart("Sala");

        termostato.mostrarNome();
        termostato.ligar();
        System.out.println("Temperatura: " + termostato.lerTemperatura() + "°C");
        termostato.desligar();
    }
}
