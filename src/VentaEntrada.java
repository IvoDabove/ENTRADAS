import java.util.Scanner;

public class VentaEntrada{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarión de variables
        int entradasDispm=0;
        int cantUsuario=5;
        int precioEntrada=40000;
        int total;
        String saludo ="Somos Disney Plus, una empresa que ofrece servicios de entretenimiento y como nueva adquisisción implementamos la venta de entredas online para el concierto de Billie Eilish. Fecha: 10 de diciembre. /n Horario";

            System.out.println(saludo);






            
            //Ingreso de las entradas que los usuarios compran
            if(entradasDispm<1000){
                do{
                 System.out.println("Ingrese la cantidad de entradas que va a comprar, se permite comprar hasta 5 por personas");
                 cantUsuario=sc.nextInt();


                }while(cantUsuario>5);
                 total=precioEntrada*cantUsuario;
                 System.out.println("El Total a pagar es de:"+total);
            }
            
        
        
        sc.close();





    }


}



