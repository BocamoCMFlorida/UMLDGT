import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGestion {
    private List<Propietario> propietarios = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Propietario buscarPropietarioDNI(String dni) {
        for (Propietario p : propietarios) {
            if (p.getDNI().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    public Propietario buscarPropietarioApellido(String apellido) {
        for (Propietario p : propietarios) {
            if (p.getApellidos().equalsIgnoreCase(apellido)) {
                return p;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculoMatricula(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    public void altaPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void altaVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Gestión - Menú");
            System.out.println("1. Alta Propietario");
            System.out.println("2. Alta Vehículo");
            System.out.println("3. Buscar Propietario por DNI");
            System.out.println("4. Buscar Propietario por Apellido");
            System.out.println("5. Buscar Vehículo por Matrícula");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese Puntos: ");
                    int puntos = scanner.nextInt();
                    scanner.nextLine();
                    sistema.altaPropietario(new Propietario(dni, nombre, apellidos, puntos));
                    System.out.println("Propietario registrado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese DNI del propietario: ");
                    String dniProp = scanner.nextLine();
                    Propietario propietario = sistema.buscarPropietarioDNI(dniProp);
                    if (propietario == null) {
                        System.out.println("Propietario no encontrado.");
                        break;
                    }
                    System.out.print("Ingrese Kilometraje: ");
                    double km = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese Año de Fabricación: ");
                    String fechaFab = scanner.nextLine();
                    sistema.altaVehiculo(new Vehiculo(matricula, marca, propietario.getDNI(), km, fechaFab));
                    System.out.println("Vehículo registrado con éxito.");
                    break;
                case 3:
                    System.out.print("Ingrese DNI del propietario: ");
                    Propietario pDni = sistema.buscarPropietarioDNI(scanner.nextLine());
                    System.out.println(pDni != null ? "Propietario encontrado: " + pDni.getNombre() : "No encontrado.");
                    break;
                case 4:
                    System.out.print("Ingrese Apellido del propietario: ");
                    Propietario pApellido = sistema.buscarPropietarioApellido(scanner.nextLine());
                    System.out.println(pApellido != null ? "Propietario encontrado: " + pApellido.getNombre() : "No encontrado.");
                    break;
                case 5:
                    System.out.print("Ingrese Matrícula del vehículo: ");
                    Vehiculo vehiculo = sistema.buscarVehiculoMatricula(scanner.nextLine());
                    System.out.println(vehiculo != null ? "Vehículo encontrado: " + vehiculo.getMarca() : "No encontrado.");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}