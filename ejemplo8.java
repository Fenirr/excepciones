import java.util.InputMismatchException;
import java.util.Scanner;
public class excepcion8 {
public static void main (String[]arg){
	Scanner sc =new Scanner(System.in);
	int []array={4,2,6,7};
	int n;
	boolean repetir= false;
	do{
		try{
			repetir =false;
			System.out.println("introduce un numero entero > 0 y <"+array.length+"");
		n=sc.nextInt();
		System.out.println("valor en la posicion"+n+":"+ array[n]);
		
		}
		
		catch(InputMismatchException excepcion){
			sc.nextLine();
			n=0;
			System.out.println("debo introducir un numero entero");
			repetir =true;
			
		
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("debe introducir un numero entero >0 y<"+array.length+"");
	repetir =true;	
		}
	}while(repetir);
	
}
}
//este programa maneja la excepcion si se ongresa un numero no entero asi como si se introduce un numero fuera del array
