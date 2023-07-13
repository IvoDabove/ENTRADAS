import java.util.Scanner;

public class Estadisticas {

  public static int countCalled = 0;
  public static int flag;
  public static Scanner scanner = new Scanner(System.in);
  public static int precioPlatea = 150;
  public static int precioDel = 300;
  public static int precioTras = 200;
  public static int PrecioTotUnitPlatea;
  public static int PrecioTotUnitDel;
  public static int PrecioTotUnitTras;
  public static int precioTot;

  public Estadisticas() {

  }

  public static void verEstadisticas() {

    System.out.println(" ");
    System.out.println("Butacas de platea:");
    Butacas.obtenerEntradasReservadasPlatea();
    Butacas.obtenerEntrdasDispPlatea();
    System.out.println("Precio por butaca:$" + precioPlatea);
    System.out.println("Cantidad de entradas disponibles:" + VentaEntrada.cantEntradasDispPlatea);
    System.out.println("Cantidad de entradas reservadas:" + VentaEntrada.cantEntradasReservadasPlatea);
    PrecioTotUnitPlatea = VentaEntrada.cantEntradasReservadasPlatea * precioPlatea;
    System.out.println("Ganancias obtenidas:" + PrecioTotUnitPlatea);
    Butacas.verButacasPlatea();
    System.out.println(" ");

    System.out.println("Butacas de campo delantero:");
    Butacas.obtenerEntradasReservadasDel();
    Butacas.obtenerEntrdasDispDel();
    System.out.println("Precio por butaca:$" + precioDel);
    System.out.println("Cantidad de entradas disponibles:" + VentaEntrada.cantEntradasDispDel);
    System.out.println("Cantidad de entradas reservadas:" + VentaEntrada.cantEntradasReservadasDel);
    PrecioTotUnitDel = VentaEntrada.cantEntradasReservadasDel * precioDel;
    System.out.println("Ganancias obtenidas:" + PrecioTotUnitDel);
    Butacas.verButacasDel();
    System.out.println(" ");

    System.out.println("Butacas de campo trasero:");
    Butacas.obtenerEntradasReservadasTras();
    Butacas.obtenerEntrdasDispTras();
    System.out.println("Precio por butaca:$" + precioTras);
    System.out.println("Cantidad de entradas disponibles:" + VentaEntrada.cantEntradasDispTras);
    System.out.println("Cantidad de entradas reservadas:" + VentaEntrada.cantEntradasReservadasTras);
    PrecioTotUnitTras = VentaEntrada.cantEntradasReservadasTras * precioTras;
    System.out.println("Ganancias obtenidas:" + PrecioTotUnitTras);
    Butacas.verButacasTras();
    System.out.println(" ");
    precioTot = PrecioTotUnitDel + PrecioTotUnitPlatea + PrecioTotUnitTras;
    System.out.println("Ganancias totales:" + precioTot);
    countCalled++;
    System.out.println(" ");
    volver();

  }

  public static void volver() {
   Bienvenida volver = new Bienvenida();
    System.out.println( "Presione 1 si desea Volver atrás");
    flag = scanner.nextInt();
    switch (flag) {
      case 1:
      volver.mostrar();
        
        break;

      case 2:
      System.exit(0);
        break;
    }
  }

}
