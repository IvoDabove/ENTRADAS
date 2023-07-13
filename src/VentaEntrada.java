import java.util.Scanner;

public class VentaEntrada {
 public static int  butacasAsiento=0001;
  public static int cantEntradas;
  public static int precioComprobante;
  public static String[] nombres = new String[200];
 public static int counterFila=Butacas.fila+1;
  public static String msgComprobante;
  public static int numPedido=9000;
  public static String tipoEntrada;
  public static int cantUsuario;
  public static int precioEntrada;
  public static int precioTotal;

  public static int dni;
  public static String email;
  public static String telefono;
  public static int numTarjeta;
  public static int numSeguridad;
  public static int contNombres;
  public static int cantEntradasDisp = 0;
  public static int cantEntradasDispPlatea = 0;
  public static int cantEntradasDispDel = 0;
  public static int cantEntradasDispTras = 0;
  public static int cantEntradasReservadasTras;
  public static int cantEntradasReservadasDel;
  public static int cantEntradasReservadasPlatea;
  public static Scanner sc = new Scanner(System.in);

  public VentaEntrada() {
  }

  public void SelecTipoEntrada() {

    int numTipo;
    System.out.println("*Presione 1 si desea comprar la entrada de campo delantero\n" +
        "*Presione 2 si desea comprar la entrada de platea\n" +
        "*Presione 3 si desea comprar la entrada de campo trasero\n");
    numTipo = sc.nextInt();

    switch (numTipo) {
      case 1:
        tipoEntrada = "campo delantero";
        precioEntrada = 300;

        break;
      case 2:
        tipoEntrada = "Platea";
        precioEntrada = 150;

        break;
      case 3:
        tipoEntrada = "Campo trasero";
        precioEntrada = 200;

        break;
      default:
        SelecTipoEntrada();
    }

    cantEntradas();
  };

  public void comprarEntradas() {
    System.out.println("Ingrese la cantidad de entradas que va a comprar, se permite comprar hasta 5 por personas");
    cantEntradas = sc.nextInt();
  }

  public static void cantEntradas() {
    do {
      System.out.println("Ingrese la cantidad de entradas que desee comprar, se permiten hasta 5");
      cantEntradas = sc.nextInt();
    } while (cantEntradas > 5);
    if (precioEntrada == 300) {
      Butacas.tipoButacas = Butacas.butacasDel;
      if (Estadisticas.countCalled >= 0) {
        Butacas.verButacasDel();
        Butacas.llenarButacasDel();
      } else {
        Butacas.iniciarButacas();
      }

    } else if (precioEntrada == 150) {
      Butacas.tipoButacas = Butacas.butacasPlatea;
      if (Estadisticas.countCalled >= 0) {
        Butacas.verButacasPlatea();
        Butacas.llenarButacasPlatea();
      } else {
        Butacas.iniciarButacas();
      }

    } else if (precioEntrada == 200) {
      Butacas.tipoButacas = Butacas.butacasTras;
      if (Estadisticas.countCalled >= 0) {
        Butacas.verButacasTras();
        Butacas.llenarButacasTras();
      } else {
        Butacas.iniciarButacas();
      }

    }

  };

  public static void ObtenerValorEntrada(){
    if(precioEntrada==300){
       Butacas.obtenerEntradasReservadasDel();
       Estadisticas.PrecioTotUnitDel=VentaEntrada.cantEntradasReservadasDel * Estadisticas.precioDel;
       precioComprobante=Estadisticas.PrecioTotUnitDel;
    }else if(precioEntrada==200){
      Butacas.obtenerEntradasReservadasTras();
      Estadisticas.PrecioTotUnitTras=VentaEntrada.cantEntradasReservadasTras * Estadisticas.precioTras;
      precioComprobante=Estadisticas.PrecioTotUnitTras;
    }else if(precioEntrada==150){
      Butacas.obtenerEntradasReservadasPlatea();
      Estadisticas.PrecioTotUnitPlatea=VentaEntrada.cantEntradasReservadasPlatea * Estadisticas.precioPlatea;
      precioComprobante=Estadisticas.PrecioTotUnitPlatea;
    }
  }

  public static void setDatosComprobante() {
    sc.nextLine();
    Registro.registrarComprobantes();
    /*
     * System.out.println("Ingresá tu nombre");
     * nombres[contNombres]=sc.nextLine();
     * System.out.println("Ingresá tu D.N.I");
     * dni=sc.nextInt();
     * System.out.println("Ingresá tu número de tarjeta de débito o crédito");
     * numTarjeta=sc.nextInt();
     * System.out.println("Ingrese el número de seguridad");
     * numSeguridad=sc.nextInt();
     */
    ObtenerValorEntrada();
    VentaEntrada.imprimirComprobante();

  }
  public static void obtenerAsiento(){
   System.out.println(butacasAsiento);
  }

  public static void imprimirComprobante() {
  System.out.println("Enviando el comprobante al teléfono...\n");
  System.out.println("Comprobante enviado con éxito");
    msgComprobante = "******************\n" +
        "*            ---Comprobante---                   *\n" +
        "*    ¡Gracias por comprar en Disney Plus!        *\n" +
        "*    Tu pedido:"+"#"+numPedido+ " ha sido procesado.     *\n" +
        "*    Nombre:" + nombres[contNombres] + "             *\n" +
        "*    Tarjeta: " + numTarjeta + "                     *\n" +
        "*    DNI:" + dni + "                                 *\n" +
        "*    Sector:" + tipoEntrada + "                      *\n" +
        "*    Fila:" + counterFila + " Asiento: 000"+butacasAsiento+"                  *\n" +
        "*    Precio:" + precioComprobante + "                      *\n" +
        "*    Fecha: 10 de diciembre                      *\n" +
        "*    Horario: 21:00 hs                           *\n" +
        "*    Lugar: Movistar Arena                       *\n" +
        "*                                                *\n" +
        "******************\n";
    System.out.println(msgComprobante);
    butacasAsiento++;
    contNombres++;
    numPedido++;
    System.out.println("Butacas reservadas con éxito, disfrute el concierto!");
    Butacas.a = 0;
    Butacas.b = 0;
    Butacas.c = 0;
    cantEntradasDispDel = 0;
    cantEntradasDispPlatea = 0;
    cantEntradasDispTras = 0;
    cantEntradasReservadasDel = 0;
    cantEntradasReservadasPlatea = 0;
    cantEntradasReservadasTras = 0;
    System.out.println("\n");
    // System.out.println( cantEntradasDisp);
    Bienvenida reinicio = new Bienvenida();
    reinicio.mostrar();
  }
}
