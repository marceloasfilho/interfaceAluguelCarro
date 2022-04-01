package application;

import entities.Aluguel;
import services.BrasilTaxaServico;

public class Program {
    public static void main(String[] args) {

        Aluguel aluguel = new Aluguel(10.00, 130.00, new BrasilTaxaServico());
        System.out.println(aluguel.getPrecoPorDia());

    }
}
