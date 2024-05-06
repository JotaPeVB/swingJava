package GerenciamentoVeiculos;

public class Caminhao extends Veiculos {
    private Double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, Double cargaMaxima) {
        super(marca, modelo, ano);
        this.cargaMaxima = cargaMaxima;
    }
}
