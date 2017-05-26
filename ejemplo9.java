import java.util.Scanner;
import java.util.InputMismatchException;

public class excepcion9 {
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	int n1, n2;
	try{
		System.out.println("introduce un numero");
	n1 = sc.nextInt();
	try{
		System.out.println("introduce otro numero");
		n2=sc.nextInt();
		System.out.println(n1+"/"+n2+"="+n1/(double)n2);
		
	}
	catch (InputMismatchException e ){
		sc.nextLine();
		n2=0;
		System.out.println("debe introducir un numero");
	}
	catch (ArithmeticException e ){
		sc.nextLine();
		n2=0;
		System.out.println("no se puede dividir entre 0");
	}
	}
	catch (InputMismatchException e ){
		sc.nextLine();
		n1=0;
		System.out.println("debe introducir un numero");
	}
		
	
}
}
