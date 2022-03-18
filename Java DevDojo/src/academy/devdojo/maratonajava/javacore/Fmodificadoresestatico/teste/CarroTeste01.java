package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes-Benz", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        c1.imprim();
        c2.imprim();
        c3.imprim();
    }
}
