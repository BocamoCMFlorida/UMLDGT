public class Propietario {
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private int Puntos;

    public Propietario(String DNI, String nombre, String apellidos, int puntos) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
        Puntos = puntos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int puntos) {
        Puntos = puntos;
    }

    @Override
    public String toString() {
        return "Propietario{DNI='" + DNI + "', Nombre='" + Nombre + "', Apellidos='" + Apellidos + "', Puntos=" + Puntos + "}";
    }
}
