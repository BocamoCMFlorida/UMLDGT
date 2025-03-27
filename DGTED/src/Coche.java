class Coche extends Vehiculo {
    private int asientos;
    private boolean airbags;
    private boolean tieneSillaBebe;

    public Coche(String matricula, String marca, String propietario, Double KM, String fechaFabricacion, int asientos, boolean airbags, boolean tieneSillaBebe) {
        super(matricula, marca, propietario, KM, fechaFabricacion);
        this.asientos = asientos;
        this.airbags = airbags;
        this.tieneSillaBebe = tieneSillaBebe;
    }

    @Override
    public String toString() {
        return "Coche{asientos=" + asientos +
                ", airbags=" + (airbags ? "Sí" : "No") +
                ", tieneSillaBebe=" + (tieneSillaBebe ? "Sí" : "No") + "}";
    }
}
