package main;

import logic.Biblioteca;
import ui.InterfaceBibliotecario;
import ui.InterfaceMembroBiblioteca;
import ui.InterfaceAdministrador;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        InterfaceBibliotecario interfaceBibliotecario = new InterfaceBibliotecario(biblioteca);
        InterfaceMembroBiblioteca interfaceMembroBiblioteca = new InterfaceMembroBiblioteca(biblioteca);
        InterfaceAdministrador interfaceAdministrador = new InterfaceAdministrador(biblioteca);
    }}
