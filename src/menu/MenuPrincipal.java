package menu;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal(Scanner scanner){
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-        MENU CAPITULO DE PROGRAMACION         -");
            System.out.println("-         YIBETH OSPINA Y YAMILE VEGA          -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Datos primitivos.                  -");
            System.out.println("-        2. String                             -");
            System.out.println("-        3. Constante                          -");
            System.out.println("-        4. Tipo de operadores                 -");
            System.out.println("-        5. Condicional IF, ELSE, IF ELSE      -");
            System.out.println("-        6. Condicional Switch                 -");
            System.out.println("-        7. Condicional Ternaria               -");
            System.out.println("-        8. Bucle DO WHILE                     -");
            System.out.println("-        9. Bucle WHILE                        -");
            System.out.println("-        10. Bucle FOR                         -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    MenuExplicacion1 menuExplicacion1 = new MenuExplicacion1(scanner, this);
                    menuExplicacion1.mostrarMenuExplicacion1();
                    break;
                case 2:
                    ExplicacionString();
                    break;
                case 3:
                    ExplicacionConst();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private void ExplicacionString(){
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION STRING             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa una cadena de   -");
        System.out.println("-  caracteres.                                 -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  String saludo = 'Hola, mundo!';             -");
        System.out.println("------------------------------------------------");
    }

    private void ExplicacionConst(){
        System.out.println("------------------------------------------------");
        System.out.println("-          EXPLICACION DE CONSTANTE            -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Es un valor que no cambia durante la        -");
        System.out.println("-  ejecución de un programa. A diferencia de   -");
        System.out.println("-  las variables, cuyo valor puede modificarse,-");
        System.out.println("-  las constantes están diseñadas para mantener-");
        System.out.println("-  un valor fijo a lo largo de la ejecución del-");
        System.out.println("-  programa.                                   -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  const int MAX_USERS = 100;                  -");
        System.out.println("------------------------------------------------");
    }

}