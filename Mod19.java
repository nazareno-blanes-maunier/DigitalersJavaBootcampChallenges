/*Crear un programa que genere números enteros aleatorios
entre 1 y la cantidad de elementos y mostrar cuáles son
divisibles entre 3 y 5, con las siguientes condiciones:
1. Debe pedir ingresar la cantidad de
elementos a generar.
2. Si el número es divisible por 3
mostrar Fizz.
3. Si el número es divisible por 5
mostrar Buzz.
4. Si el número es divisible por 3 y 5
mostrar FizzBuzz.
5. De lo contrario, mostrar el número.*/
import java.util.Arrays;
import java.util.Scanner;

public class Mod19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadElementos;
        int numerosAleatorios[];
       
        System.out.print("Indique la cantidad de elementos a generar: ");
        cantidadElementos = teclado.nextInt();

        numerosAleatorios = new int[cantidadElementos];
        for(int i=0; i<numerosAleatorios.length; i++) {
			numerosAleatorios[i]=(int) (Math.random()*cantidadElementos+1);
		}
        System.out.println(Arrays.toString(numerosAleatorios));
        for(int i=0; i<numerosAleatorios.length; i++) {
			int numero = numerosAleatorios[i];
			boolean divisible3 = numero % 3 == 0;
			boolean divisible5 = numero%5==0;
			String resultado = "";
			
			if(divisible3) {
				resultado="Fizz";
			}
			if(divisible5) {
				resultado="Buzz";
			}
			
			if(divisible3 && divisible5) {
				resultado="FizzBuzz";
			}
			System.out.println(resultado.length()>0?resultado : numero);
			
		}
		teclado.close();
		
    }
}
