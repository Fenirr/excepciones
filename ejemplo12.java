import java.util.InputMismatchException;
import java.util.Scanner;
public class excepcion12 {
public static void main  (String[]arg){
	try{
		
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("introduce tu nombre ,por favor");
	String nombre_usuario=entrada.nextLine();
	System.out.println("introduce tu edad");
	int edad=entrada.nextInt();
	System.out.println("hola"+nombre_usuario+"el año que viene tendras"+(edad+1)+"años");
	entrada.close();
	}
	catch(InputMismatchException e){
		System.out.println("que rayos pusiste!!!!");
}
}
}
///en este programa se piden los datos al usuario si en la edad pone otro valor que no sea un numero entero te aparecera un dialogo !que rayos hiciste¡¡¡
