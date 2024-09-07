package menu;

import java.util.Scanner;

public class MenuExplicacion1 {
    private Scanner scanner;
    private MenuPrincipal menuPrincipal;

    public MenuExplicacion1(Scanner scanner, MenuPrincipal menuPrincipal){
        this.scanner = scanner;
        this.menuPrincipal = menuPrincipal;
    }

    public void mostrarMenuExplicacion1() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-               DATOS PRIMITIVOS               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Explicacion byte                   -");
            System.out.println("-        2. Explicacion short                  -");
            System.out.println("-        3. Explicacion int                    -");
            System.out.println("-        4. Explicacion long                   -");
            System.out.println("-        5. Explicacion float                  -");
            System.out.println("-        6. Explicacion double                 -");
            System.out.println("-        7. Explicacion char                   -");
            System.out.println("-        8. Explicacion boolean                -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion1 = scanner.nextInt();

            switch(opcion1) {
                case 1:
                    mostrarExplicacionByte();
                    break;
                case 2:
                    mostrarExplicacionShort();
                    break;
                case 3:
                    mostrarExplicacionInt();
                    break;
                case 4:
                    mostrarExplicacionLong();
                    break;
                case 5:
                    mostrarExplicacionFloat();
                    break;
                case 6:
                    mostrarExplicacionDouble();
                    break;
                case 7:
                    mostrarExplicacionChar();
                    break;
                case 8:
                    mostrarExplicacionBoolean();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return; // Salir del bucle y regresar al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private void mostrarExplicacionByte() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION BYTE               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa un entero, sin  -");
        System.out.println("-  signo de numero 0 a 255                     -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  char letra = 'A'; // 'A' ocupa 1 byte       -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionShort() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION SHORT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato entero que ocupa menos espacio -");
        System.out.println("-  en memoria en comparación con otros tipos   -");
        System.out.println("-  de datos enteros como 'int'                 -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  short num1 = 10000                          -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionInt() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION INT                -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros, no superiores a tres cifras        -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        int edad = 25;                        -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionLong(){
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION LONG               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros muy grandes, mayores a los que      -");
        System.out.println("-  soporta el tipo int                         -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        long distancia = 3680000L;            -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionFloat(){
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION FLOAT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal, pero con precision       -");
        System.out.println("-  simple (aproximadamente 7 dígitos)          -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        float temperatura = 36.5 ;            -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionDouble(){
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION DOUBLE              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal y mayor precision         -");
        System.out.println("-  que el tipo float (aproximadamente 15       -");
        System.out.println("-  dígitos).                                   -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        double pi = 3.14159265359;            -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionChar(){
        System.out.println("------------------------------------------------");
        System.out.println("-                EXPLICACION CHAR              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  un único carácter.                          -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        char inicial = 'A';                   -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionBoolean(){
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION BOOLEAN             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  valores de verdad, es decir, verdadero o    -");
        System.out.println("-  falso (true o false).                       -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        boolean esMayor = true;               -");
        System.out.println("------------------------------------------------");

    }
}