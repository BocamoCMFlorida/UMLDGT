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

    public void mostrarTodosLosDatos() {
        System.out.println("\nLista de Propietarios:");
        for (Propietario p : propietarios) {
            System.out.println(p);
        }

        System.out.println("\nLista de Vehículos:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();

        // Agregar objetos de muestra
        Propietario p1 = new Propietario("12345678A", "Carlos", "Fernandez", 12);
        Propietario p2 = new Propietario("87654321B", "Laura", "Gomez", 10);
        sistema.altaPropietario(p1);
        sistema.altaPropietario(p2);

        Vehiculo v1 = new Coche("ABC123", "Toyota", p1.getDNI(), 50000.0, "2018", 5, true, false);
        Vehiculo v2 = new Moto("XYZ789", "Honda", p2.getDNI(), 15000.0, "2020", false, 150);
        sistema.altaVehiculo(v1);
        sistema.altaVehiculo(v2);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Gestión - Menú");
            System.out.println("1. Alta Propietario");
            System.out.println("2. Alta Vehículo");
            System.out.println("3. Buscar Propietario por DNI");
            System.out.println("4. Buscar Vehículo por Matrícula");
            System.out.println("5. Mostrar todos los datos");
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
                    System.out.print("Ingrese Matrícula del vehículo: ");
                    Vehiculo vehiculo = sistema.buscarVehiculoMatricula(scanner.nextLine());
                    System.out.println(vehiculo != null ? "Vehículo encontrado: " + vehiculo.getMarca() : "No encontrado.");
                    break;
                case 5:
                    sistema.mostrarTodosLosDatos();
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
