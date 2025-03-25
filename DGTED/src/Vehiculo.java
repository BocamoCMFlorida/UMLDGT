public class Vehiculo {
    private String Matricula;
    private String Marca;
    private String Propietario;
    private Double KM;
    private int FechaFabricacion;

    public Vehiculo(String matricula, String marca, String propietario, Double KM, int fechaFabricacion) {
        Matricula = matricula;
        Marca = marca;
        Propietario = propietario;
        this.KM = KM;
        FechaFabricacion = fechaFabricacion;
    }
}
