class Moto extends Vehiculo {
    private int potencia;

    public Moto(String matricula, String marca, String propietario, Double KM, String fechaFabricacion, int potencia) {
        super(matricula, marca, propietario, KM, fechaFabricacion);
        this.potencia = potencia;
    }
}