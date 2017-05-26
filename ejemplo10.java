import java.util.Scanner;

public class excepcion10 {
public static void main(String[]args){
	try{
		double x = leerValor();
		System.out.println("raiz cuadrada de "+ x + "=" +Math.sqrt(x));
	}
	catch(ValorNoValido e){
		System.out.println(e.getMessage());
	}
	
}

public static double leerValor()throws ValorNoValido{
	Scanner sc=new Scanner(System.in);
	System.out.println("introduce un numero mayor a 0");
	double n=sc.nextDouble();
	if(n<=0){
		throw new ValorNoValido("el numero debe ser positivo");

	}
	return n;
}
}
