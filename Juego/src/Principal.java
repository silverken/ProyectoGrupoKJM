import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws Exception {

	
	String cadena=null;
	System.out.println("Bienvenido al juego del reverso.");
	Scanner sc = new Scanner(System.in); 
	
	while (cadena!="salir") {
	System.out.println("Dame una palabra o frase y yo le daré la vuelta.");
	cadena=sc.nextLine();
	
	StringBuilder builder=new StringBuilder(cadena);	
	String CadenaInvertida=null;
	CadenaInvertida=builder.reverse().toString();
	
	System.out.println("Esta es lo que haz introducido: "+cadena);
	System.out.println("Así es invertido: "+CadenaInvertida);
	
	}
	sc.close();
	}

	
}
