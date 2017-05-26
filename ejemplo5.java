package EJEMPLOS;

public class EXCEPCION5 {
public static int numerador=10;
public static int denominador=0;
public static float division;

public static void main(String[]args){
	System.out.println("antes de hacer la divicion");
	try{
		division = numerador/denominador;
	
	}
	catch(ArithmeticException excepcion){
		division=0;
	    System.out.println("error"+excepcion.getMessage());
	}
	finally{
		System.out.println("division"+division);
		System.out.println("despues de hacer la division");
	}
}
}
