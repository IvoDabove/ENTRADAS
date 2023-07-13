import java.util.Scanner;

public class Bienvenida {

  private String msg;
  public static int opcion;
  Scanner sc = new Scanner(System.in);

  public static void getPrecios() {
    System.out.println("\nPrecio de las entrada por campo:\n" +
        "Platea-$150 \n" +
        "Campo delantero-$300 \n" +
        "Campo trasero-$200 \n");
    Registro.ingresarNumero();
  }

  public Bienvenida() {

    msg = "***************************************************************\n" +
        "*        ¡Somos Disney Plus, una empresa                     *\n" +
        "*      que ofrece servicios de entretenimiento               *\n" +
        "*     y como nueva adquisición, implementamos                *\n" +
        "*       la venta de entradas online para el                  *\n" +
        "*            concierto de Billie Eilish!                     *\n" +
        "*  ¡Asegura tu lugar en el concierto de tus sueños!          *\n" +
        "*  ¡La música te espera, compra tu entradas ahora!           *\n" +
        "*   Fecha: 10 de diciembre                                   *\n" +
        "*   Horario: 21:00 hs                                        *\n" +
        "*   Lugar: Movistar Arena                                    *\n" +
        "**************************************************************\n";
  }

  public void mostrar() {
    Butacas.a = 0;
    Butacas.b = 0;
    Butacas.c = 0;
    // VentaEntrada butacaInicial=new VentaEntrada();
    // butacaInicial.generarButacas();
    // VentaEntrada.obtenerEntrdasDispTras();
    // VentaEntrada.obtenerEntrdasDispPlatea();
    // VentaEntrada.obtenerEntrdasDispDel();
    try {
      System.out.println(msg);
      System.out.println("Precio de las entrada por campo:\n" +
          "Platea-$150 \n" +
          "Campo delantero-$300 \n" +
          "Campo trasero-$200 \n");
      System.out.println("Presione 1 para ver estadísticas\n" +
          "Presione 2 si desea continuar con la compra de entradas\n" +
          "Presione 3 Si desea salir del programa");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          Estadisticas.verEstadisticas();

          break;
        case 2:
          Registro.ingresarNumero();
        case 3:
          System.exit(0);

      }
    } catch (Exception e) {
      mostrar();
    }
  }
}
