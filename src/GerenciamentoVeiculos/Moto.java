package GerenciamentoVeiculos;

public class Moto extends Veiculos {
    private String cilindradas;

    public Moto(String marca, String modelo, int ano, String cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
}
