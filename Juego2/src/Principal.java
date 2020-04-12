import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws Exception {

		
	String cadena=null;
	Scanner sc = new Scanner(System.in); 
	
	while (cadena!="salir") {

	cadena=sc.nextLine();
	StringBuilder builder=new StringBuilder(cadena);	
	String CadenaInvertida=null;
	CadenaInvertida=builder.reverse().toString();
	
	}
	sc.close();
	}

	
}
