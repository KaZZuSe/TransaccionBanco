import java.util.Scanner;

public class TransaccionBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        int saldo = 3000;

        while (true) {
            System.out.print("\n*****BIENVENIDO A SU BANCO*****");
            System.out.print("\nQué desea hacer?");
            System.out.print("\n1) Ingresar efectivo");
            System.out.print("\n2) Retirar efectivo");
            System.out.print("\n3) Mostrar datos");
            System.out.print("\n4) Salir");

            System.out.print("\nElige una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    saldo = ingresarSaldo(scanner, saldo);
                    break;
                case 2:
                    saldo = retirarSaldo(scanner, saldo);
                    break;
                case 3:
                    mostrarDatos(nombre, saldo);
                    break;
                case 4:
                    System.out.print("GRACIAS POR SU CONFIANZA!");
                    scanner.close();
                    return;
                default:
                    System.out.print("Opción no válida. Vuelva a intentarlo.");
            }
        }
    }

    public static int ingresarSaldo(Scanner scanner, int saldo) {
        System.out.print("Introduce el saldo a ingresar: ");
        int cantidad = scanner.nextInt();
        saldo += cantidad;
        System.out.println("Saldo actualizado: " + saldo);
        return saldo;
    }

    public static int retirarSaldo(Scanner scanner, int saldo) {
        System.out.print("Introduce el saldo a retirar: ");
        int cantidad = scanner.nextInt();
        if (cantidad > saldo) {
            System.out.println("No se puede retirar una cantidad mayor al saldo actual.");
        } else {
            saldo -= cantidad;
            System.out.println("Saldo actualizado: " + saldo);
        }
        return saldo;
    }

    public static void mostrarDatos(String nombre, int saldo) {
        System.out.println("Hola " + nombre + ", su saldo actual es: " + saldo);
    }
}