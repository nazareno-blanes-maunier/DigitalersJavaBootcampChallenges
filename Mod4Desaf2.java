
public class Mod4Desaf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Una persona desea invertir $1000 en un banco, el
		cual le otorga un 2% de interés mensual ¿Cuál
		será la cantidad de dinero que esta persona
		tendrá al cabo de un año?
		En el primer mes tendrá acumulado 1000 $ más
		20 $ de interés ( 2% de 1000 ). En el segundo
		mes se le sumará un 2% a la base de 1020 $ del
		mes anterior y así sucesivamente. */
		
		double dinero = 1000;
		int mes = 1;
		
		while (mes<=12){
		
			dinero = dinero * 1.02;
		    mes++;
		double roundDinero = Math.round(dinero*100.0)/100.0;
		System.out.println("Mes " + mes + ": $ "+ roundDinero);
	    }
	
     }
}
