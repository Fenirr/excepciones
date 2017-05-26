public class excepcion13 {
public static void main(String[]arg){
	
	
	String str1="jhf";
	String str2="3";
	String respuesta;
	int numerador,denominador,cociente;
	
	try{
		numerador=Integer.parseInt(str1);
		denominador=Integer.parseInt(str2);
		
		cociente=numerador/denominador;
respuesta=String.valueOf(cociente);
	}
	catch(NumberFormatException e){
		 respuesta="Se han introducido caracteres no numéricos";
    }catch(ArithmeticException ex){
        respuesta="División entre cero";
    
    }
    System.out.println(respuesta);
	}

        
    }
