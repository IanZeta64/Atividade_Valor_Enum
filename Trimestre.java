public enum Trimestre {
    JANEIRO (10000D, "janeiro"), FEVEREIRO(17000D, "fevereiro" ), MARCO(23000D, "março");
    private Double valor;
    private String mes;
    Trimestre (Double valor, String mes){
        this.valor = valor;
        this.mes = mes;
    }

    public Double getValor() {
        return valor;
    }

    public String getMes() {
        return mes;
    }
}
