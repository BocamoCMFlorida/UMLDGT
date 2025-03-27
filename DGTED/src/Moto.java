class Moto extends Vehiculo {
    private int potencia;
    private boolean EsdeAgua;

    public Moto(String matricula, String marca, String propietario, Double KM, String fechaFabricacion, boolean esdeAgua, int potencia) {
        super(matricula, marca, propietario, KM, fechaFabricacion);
        EsdeAgua = esdeAgua;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Moto{potencia=" + potencia + ", EsdeAgua=" + EsdeAgua + "}";
    }
}