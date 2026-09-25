import model.*;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(0, "Ale777");
        Produto nescau = new Produto("Nescau", 7, 3);
        Carro carro = new Carro("Volkswagen", "Gol", 2019, "Branco", "BRA2E19", 15.0f, 55.0f);


        System.out.println("====== Conta Bancária ======");

        conta.depositar(100);
        conta.depositar(-50);

        conta.sacar(30);
        conta.sacar(100);
        conta.sacar(-20);

        System.out.println("Saldo: " + conta.getSaldo());


        System.out.println("\n=====      Produto     =====");

        nescau.setPreco(10);
        nescau.setPreco(-5);

        nescau.setQuantidadeEstoque(10);
        nescau.setQuantidadeEstoque(-3);

        System.out.println("Preço: " + nescau.getPreco());
        System.out.println("Estoque: " + nescau.getQuantidadeEstoque());


        System.out.println("\n======      Carro     ======");

        carro.Ligar();
        carro.Ligar();

        carro.Buzinar();

        carro.quantidadeRestante();
        carro.valorRestante(6.20f);

        carro.encher(20);
        carro.encher(-10);
        carro.encher(100);

        System.out.println("Gasolina: " + carro.getGasolina() + "L");

        carro.Desligar();
        carro.Desligar();
    }
}