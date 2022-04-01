package services;

public class BrasilTaxaServico implements TaxaServico {
    @Override
    public Double tax(Double quantidade) {
        return quantidade < 100.00 ? quantidade * 0.2 : quantidade * 0.15;
    }
}
