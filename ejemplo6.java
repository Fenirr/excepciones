public class EXCEPCION6 {
public static void main(String args[]){
	try{
		System.out.println("intentamos ejecutar el bloque de instrucciones");
		System.out.println("instruccion1");
		int n= Integer.parseInt("M");
		System.out.println("instruccion2");
		System.out.println("instruccion 3 ,etc");
	}
	catch(Exception e){
		System.out.println("instrucciones a ejecutar cuando se produce un error");
	}
	finally{
		System.out.println("instrucciones a ejecutar finalmentetanto si se produce errores como si no");
	}
}
}
