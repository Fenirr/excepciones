package EJEMPLOS;
//errores personalizados,un solo catch que capture todos los errores independientemente del error
public class excepcion3 {
public static void main(String arg[]){
	int[]array = new int[20];
		try{
			String s=null;
			s.equals("QQQQ");
		}
catch(ArrayIndexOutOfBoundsException excepcion){
	System.out.println("error de un indice en un array");
}
		catch(ArithmeticException excepcion){
			System.out.println("error de divicion");
			
}
		catch(Exception excepcion ){
			System.out.println("se ha generado un error que no es de indice ,ni aritmetico");
			System.out.println("el objeto error es de tipo"+excepcion);
		}
}

}
