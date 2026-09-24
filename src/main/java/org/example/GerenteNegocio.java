package org.example;

public class GerenteNegocio {

    private Contrato contrato;
    private Relatorio relatorio;

    public GerenteNegocio(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.relatorio = fabrica.createRelatorio();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirRelatorio() {
        return this.relatorio.emitir();
    }
}