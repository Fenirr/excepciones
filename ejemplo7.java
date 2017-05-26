import java.util.InputMismatchException;
import java.util.Scanner;
public class exepcion7 {
public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	int n;
	do{
		try{
			System.out.println("introduce un numero entero >0:");
		n= sc.nextInt();
		System.out.println("numero introducido:"+n);
		}
		catch(InputMismatchException e){
			sc.nextLine();
			n=0;
			System.out.println("debe introducir un numero entero"+e.toString());
		}
		
	}while(n<=0);
}
}
//en este ejercicio se lee un nu
