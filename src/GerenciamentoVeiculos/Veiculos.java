package GerenciamentoVeiculos;

public class Veiculos {

    private String marca;
    private String modelo;
    private int ano;

    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
