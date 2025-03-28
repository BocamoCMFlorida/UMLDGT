public  class  Vehiculo {
    private String Matricula;
    private String Marca;
    private String Propietario;
    private Double KM;
    private String FechaFabricacion;

    public Vehiculo(String matricula, String marca, String propietario, Double KM, String fechaFabricacion) {
        Matricula = matricula;
        Marca = marca;
        Propietario = propietario;
        this.KM = KM;
        FechaFabricacion = fechaFabricacion;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public Double getKM() {
        return KM;
    }

    public void setKM(Double KM) {
        this.KM = KM;
    }

    public String getFechaFabricacion() {
        return FechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        FechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{Matricula='" + Matricula + "', Marca='" + Marca + "', Propietario='" + Propietario + "', KM=" + KM + ", FechaFabricacion='" + FechaFabricacion + "'}";
    }
}

