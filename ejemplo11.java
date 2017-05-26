public class excepcion11 {
public static void main (String[]arg){
	String str="  12  ";
	int numero;
	try{
		numero=Integer.parseInt(str);
	}
	catch (NumberFormatException ex){
		System.out.println("no es un numero");
	
	}
	}
}
	
//en este programa como tiene un espacio en blanco el string provoca la excepcion//

