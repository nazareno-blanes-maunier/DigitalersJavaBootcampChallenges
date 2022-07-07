
public class Mod3Desaf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String usuario="Pepe", clave="1234";
		
		if(usuario.equals("Pepe") & clave.equals("1234")){ 
			System.out.println("Bienvenido Pepe!"); 
		}
		if(!(usuario.equals("Pepe")) & clave.equals("1234")){ 
			System.out.println("Usuario Incorrecto"); 
		}
		if(usuario.equals("Pepe") & !(clave.equals("1234"))){ 
			System.out.println("Contraseña incorrecta"); 
	}

	}
}
