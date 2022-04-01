package entities;

import services.TaxaServico;

public class Aluguel {
    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaServico taxaServico;

    public Aluguel(Double precoPorHora, Double precoPorDia, TaxaServico taxaServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaServico = taxaServico;
    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }
}
