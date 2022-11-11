public enum Meses {
    JANEIRO (10000D, "janeiro"), FEVEREIRO(17000D, "fevereiro" ), MARCO(23000D, "março"),
    ABRIL(5000D, "abril"), MAIO(20000D, "maio"), JUNHO(13000D, "junho"),
    JULHO(2000D, "julho"), AGOSTO(30000D, "agosto"), SETEMBRO(8000D, "setembro"),
    OUTUBRO(15000D, "outubro"), NOVEMBRO(11000D, "novembro"), DEZEMBRO(1000D, "dezembro");
    private final Double valor;
    private final String mes;
    Meses (Double valor, String mes){
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
