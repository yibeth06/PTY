package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal(scanner);
        menuPrincipal.mostrarMenu();
    }
}