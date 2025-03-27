public class Oficina {
    private String Ciudad;
    private String Direccion;
    private int Cpostal;

    public Oficina(String ciudad, String direccion, int cpostal) {
        Ciudad = ciudad;
        Direccion = direccion;
        Cpostal = cpostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCpostal() {
        return Cpostal;
    }

    public void setCpostal(int cpostal) {
        Cpostal = cpostal;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "Ciudad='" + Ciudad + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Cpostal=" + Cpostal +
                '}';
    }
}
