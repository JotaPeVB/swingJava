package GerenciamentoVeiculos;

public class Carro extends Veiculos{
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, String tipoCombustivel) {
        super(marca, modelo, ano);
        this.tipoCombustivel = tipoCombustivel;
    }
}
