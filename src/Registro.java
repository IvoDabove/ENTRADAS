import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro {
     private String correo;
    private String numero;
 Scanner sc=new Scanner(System.in);
  public Registro(String c,String n){
 this.correo=c;
 this.numero=n;

  }

  public void pedirDatos(String numero, String correo){
      System.out.println("Ingrese su número de celular");
      numero=sc.nextLine();

      System.out.println("Ingrese su correo electrónico");
      correo=sc.nextLine();
  };


  public void validarNumero(String numero){
       Pattern pattern = Pattern.compile("/^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$/");
       Matcher matcher = pattern.matcher(numero);
       while(matcher.find()==false){
            System.out.println("Ingrese su número de celular");
            numero=sc.nextLine();
       }



  };
  public void registro(){
     
  }
  /* 
       //https://es.stackoverflow.com/questions/136325/validar-tel%C3%A9fonos-de-argentina-con-una-expresi%C3%B3n-regular#:~:text=Prefijo%20internacional%20(opcional)%3A%20%2B54,y%203xxx%20(%2B%206%20d%C3%ADgitos) 
 //https://www.pcresumen.com/menu-software/35-lenguajes-de-programacion/java/108-las-classes-pattern-y-matcher//
    Pattern pattern = Pattern.compile("/^(?:(?:00)?549?)?0?(?:11|[2368]\\d)(?:(?=\\d{0,2}15)\\d{2})??\\d{8}$/");
    Matcher matcher = pattern.matcher(numero);
     

*/
}


