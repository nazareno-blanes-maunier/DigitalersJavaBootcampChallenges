
public class Mod5Desaf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Considerar el vector de inflación:
{0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9}
Cada ítem del vector representa la inflación
de un mes, de tal manera que el primer ítem
del vector, que es 0.8, representa la inflación
de enero y el último ítem del vector, que es 0.9,
representa la inflación de diciembre.
Con estos datos, se pide:
1. Informar la inflación anual.
2. Informar la inflación más baja junto con el
número de mes. Por ejemplo: Mes 2 = 0.1
3. Informar la inflación más alta junto con el
número de mes. Por ejemplo: Mes 12 = 0.9
4. Informar el promedio de inflación
(inflación total / 2).*/
		
		
		double[]  inflacion={0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9};
		int mes_min = 0,mes_max = 0, n;
		  double total = 0,maximo = inflacion[0], minimo = inflacion[0];
		for (n = 0; n < inflacion.length; n++){
		total = total + inflacion[n];
		 if (inflacion[n] > maximo){
		maximo = inflacion[n];
		 mes_max = n + 1;
		 }
		 if (inflacion [n] < minimo){ 
		minimo = inflacion[n];
		 mes_min = n + 1;
		 }
		}
		System.out.println("Promedio: " + total/12 + "%");
		System.out.println("Minima inflacion: " + minimo +"% mes:" + mes_min);
		System.out.println("Maxima inflacion: " + maximo +"% mes:" + mes_max);
		
	}

}
