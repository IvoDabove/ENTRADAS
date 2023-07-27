import java.util.Scanner;
import java.util.regex.Matcher;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.regex.Pattern;


public class Registro {
    
    //public static Integer num;
    
    public static void ingresarNumero(){
      Scanner scanner= new Scanner(System.in);
        Integer numCelular;
        System.out.println("Para poder comprar la entrada debe llenar un formulario con sus datos personales");
        System.out.println("Ingrese su número de celular:");
        String num=scanner.nextLine();
      try {
				 numCelular = Integer.parseInt(num);
          int size=numCelular.toString().length();
         /*Pattern pattern = Pattern.compile("^[0-9][+]");
          Matcher matcher = pattern.matcher(numCelular);*/
       
				//Parseo con éxito, no tiene letras. Pero falta comprobar si es negativo
       if( size<8 ){
          System.out.println("falta ingresar más números");
          ingresarNumero();
        };
        
				if  (numCelular < 0){ 
				 ingresarNumero(); //Sí, es negativo. No lo queremos, así que anulamos este valor.
			 }
        }catch (Exception ex) {
				System.out.println("ERROR. Introduzca valores numericos");
        System.out.println(ex);
        ingresarNumero();
			}
       VentaEntrada entrada= new VentaEntrada();
        entrada.SelecTipoEntrada();
		}
      public static void registrarComprobantes(){
         Scanner scanner= new Scanner(System.in);
         System.out.println("Para confirmar la compra, es necesario que inserte los siguientes datos:");
           System.out.println("Ingresá tu nombre");
                    VentaEntrada.nombres[VentaEntrada.contNombres]=scanner.nextLine();
                    comprobarNombres();
                    System.out.println("Ingresá tu D.N.I");
                    VentaEntrada.dni=scanner.nextInt();
                    System.out.println("Ingresá tu número de tarjeta de débito o crédito");
                    VentaEntrada.numTarjeta=scanner.nextInt();
                    System.out.println("Ingresá el número de seguridad");
                    VentaEntrada.numSeguridad=scanner.nextInt();
                    scanner.nextLine();
                    try {


                      System.out.println("Ingresá la fecha de vencimiento de la tarjeta");
                      VentaEntrada.numVencimiento=scanner.nextLine();
                    }catch(Exception err){
                      System.out.println(err);
                    }
                    
                    
                  }
public static void comprobarNombres(){
   
 /*Pattern pattern = Pattern.compile("[A-ZÄËÏÖÜÁÉÍÓÚÂÊÎÔÛÀÈÌÒÙ][a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+(?:\s+[a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+)+");
    Matcher matcher = pattern.matcher(VentaEntrada.nombres[VentaEntrada.contNombres]);
 
  if (matcher.find() == false) { registrarComprobantes(); };*/
}
 /*
 
 Pattern pattern = Pattern.compile("[A-ZÄËÏÖÜÁÉÍÓÚÂÊÎÔÛÀÈÌÒÙ][a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+(?:\s+[a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+)+");
    Matcher matcher = pattern.matcher(VentaEntradda.nombres);
 
  if (matcher.find() == false) { regustrarComprobantes(); };
 
 [A-ZÄËÏÖÜÁÉÍÓÚÂÊÎÔÛÀÈÌÒÙ][a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+(?:\s+[a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+)+ */
        
      
}
          

   
    


