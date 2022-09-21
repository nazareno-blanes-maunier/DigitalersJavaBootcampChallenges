package com.nazareno;
import entidades.Cliente;
import entidades.Documento;
import entidades.productoPerecedero;
import utilidades.mensajes;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cliente[] clientes = new Cliente[3];
		productoPerecedero[] productos = new productoPerecedero[10];

		clientes[0] = new Cliente("Octavio", "Robleto", new Documento("DNI", "01"));
		clientes[1] = new Cliente("Mariana", "Bracho", new Documento("DNI", "02"));
		clientes[2] = new Cliente("Pedro", "Montesino", new Documento("DNI", "03"));

		productos[0] = new productoPerecedero("Leche", 5.6f, 10, 5);
		productos[1] = new productoPerecedero("Queso", 7.6f, 11, 10);
		productos[2] = new  productoPerecedero("Panceta", 6.6f, 2, 51);
		productos[3] = new  productoPerecedero("Jamon", 54.6f, 4, 15);
		productos[4] = new  productoPerecedero("Atun", 57.6f, 10, 2);
		productos[5] = new productoPerecedero("Bife de Chorizo", 52.6f, 9, 8);
		productos[6] = new  productoPerecedero("Tomate", 8.6f, 8, 11);
		productos[7] = new  productoPerecedero("Cebolla", 596.6f, 25, 8);
		productos[8] = new  productoPerecedero("Queso Crema", 51.6f, 98, 96);
		productos[9] = new  productoPerecedero("Hamburguesa", 15.6f, 11, 4);

		mensajes.ofertas(clientes, productos);
        
    }
}
