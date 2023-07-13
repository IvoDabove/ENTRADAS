import java.util.Scanner;

public class Butacas {
  public static String[][] butacasTras = new String[5][5];
  public static String[][] butacasPlatea = new String[5][5];
  public static String[][] butacasDel = new String[5][5];
  public static String[][] tipoButacas = new String[5][5];
  public static int filas[]= new int[5];
  public static int fila;
  public static int columna;
  public static int a;
  public static int b;
  public static int c;
  public static int filasTot=0;
  public static Scanner sc = new Scanner(System.in);

  public Butacas() {
  }

  public static void obtenerEntrdasDisp() {

    for (int i = 0; i < tipoButacas.length; i++) {
      for (int j = 0; j < tipoButacas[i].length; j++) {

        if (tipoButacas[i][j].equals("0")) {
          VentaEntrada.cantEntradasDisp++;
        }
      }
    }
  };

  public static void obtenerEntrdasDispPlatea() {
    for (int i = 0; i < butacasPlatea.length; i++) {
      for (int j = 0; j < butacasPlatea[i].length; j++) {

        if (butacasPlatea[i][j].equals("0")) {
          VentaEntrada.cantEntradasDispPlatea++;
        }
      }
    }
  };

  public static void obtenerEntrdasDispDel() {
    for (int i = 0; i < butacasDel.length; i++) {
      for (int j = 0; j < tipoButacas[i].length; j++) {

        if (butacasDel[i][j].equals("0")) {
          VentaEntrada.cantEntradasDispDel++;
        }
      }
    }
  };

  public static void obtenerEntrdasDispTras() {
    for (int i = 0; i < butacasTras.length; i++) {
      for (int j = 0; j < butacasTras[i].length; j++) {
        if (butacasTras[i][j].equals("0")) {
          VentaEntrada.cantEntradasDispTras++;
        }
      }
    }
  };

  public static void obtenerEntradasReservadasTras() {
    for (int i = 0; i < butacasTras.length; i++) {
      for (int j = 0; j < butacasTras[i].length; j++) {
        if (butacasTras[i][j].equals("x")) {
          VentaEntrada.cantEntradasReservadasTras++;
        }
      }
    }
    ;
  }

  public static void obtenerEntradasReservadasDel() {
    for (int i = 0; i < butacasDel.length; i++) {
      for (int j = 0; j < butacasDel[i].length; j++) {
        if (butacasDel[i][j].equals("x")) {
          VentaEntrada.cantEntradasReservadasDel++;
        }
      }
    }
    ;
  }

  public static void obtenerEntradasReservadasPlatea() {
    for (int i = 0; i < butacasPlatea.length; i++) {
      for (int j = 0; j < butacasPlatea[i].length; j++) {
        if (butacasPlatea[i][j].equals("x")) {
          VentaEntrada.cantEntradasReservadasPlatea++;
        }
      }
    }
    ;
  }

  public static void generarButacas() {

    for (int i = 0; i < butacasPlatea.length; i++) {
      for (int j = 0; j < butacasPlatea[i].length; j++) {
        butacasPlatea[i][j] = "0";
      }
    }
    for (int i = 0; i < butacasDel.length; i++) {
      for (int j = 0; j < butacasDel[i].length; j++) {
        butacasDel[i][j] = "0";
      }
    }
    for (int i = 0; i < butacasTras.length; i++) {
      for (int j = 0; j < butacasTras[i].length; j++) {
        butacasTras[i][j] = "0";
      }
    }

  };
 
  public static void llenarButacas() {
    do {
      System.out.println("Inserte la fila en la que desea estar:");
      fila = sc.nextInt() - 1;
      filas[filasTot]=fila;
      filasTot++;
      System.out.println("Inserte la columna en la que desea estar:");
      columna = sc.nextInt() - 1;
      if (tipoButacas[fila][columna].equals("x")) {
        System.out.println("La posición ya está reservada, inténtelo nuevamente");
        llenarButacas();
      }
      if (tipoButacas[fila][columna].equals("0")) {
        tipoButacas[fila][columna] = "x";
      }
      for (int i = 0; i < tipoButacas.length; i++) {
        for (int j = 0; j < tipoButacas[i].length; j++) {
          System.out.print(tipoButacas[i][j] + " ");
        }
        System.out.print("\n");
      }
      c += 1;
    } while (c < VentaEntrada.cantEntradas);

    VentaEntrada.setDatosComprobante();
  };
  /* 
 public static int getFilasReservadas(){
 for(int filas:filas){
   return filas;
 }
 }*/
  public static void iniciarButacas() {
    System.out.println("Butascas disponibles:");
    for (int i = 0; i < tipoButacas.length; i++) {
      for (int j = 0; j < tipoButacas[i].length; j++) {
        tipoButacas[i][j] = "0";
        System.out.print(tipoButacas[i][j] + " ");
      }
      System.out.print("\n");
    }
    llenarButacas();
  }

  public static void llenarButacasDel() {
    do {
      System.out.println("Inserte la fila en la que desea estar:");
      fila = sc.nextInt() - 1;

      System.out.println("Inserte la columna en la que desea estar:");
      columna = sc.nextInt() - 1;

      if (butacasDel[fila][columna].equals("x")) {
        System.out.println("La posición ya está reservada, inténtelo nuevamente");
        llenarButacasDel();
      }
      if (butacasDel[fila][columna].equals("0")) {
        butacasDel[fila][columna] = "x";
      }
      for (int i = 0; i < butacasDel.length; i++) {
        for (int j = 0; j < butacasDel[i].length; j++) {
          System.out.print(butacasDel[i][j] + " ");
        }
        System.out.print("\n");
      }
      a += 1;
    } while (a < VentaEntrada.cantEntradas);

    VentaEntrada.setDatosComprobante();
  };

  public static void llenarButacasTras() {
    do {
      System.out.println("Inserte la fila en la que desea estar:");
      fila = sc.nextInt() - 1;

      System.out.println("Inserte la columna en la que desea estar:");
      columna = sc.nextInt() - 1;

      if (butacasTras[fila][columna].equals("x")) {
        System.out.println("La posición ya está reservada, inténtelo nuevamente");
        llenarButacasTras();
      }
      if (butacasTras[fila][columna].equals("0")) {
        butacasTras[fila][columna] = "x";
      }
      for (int i = 0; i < butacasTras.length; i++) {
        for (int j = 0; j < butacasTras[i].length; j++) {
          System.out.print(butacasTras[i][j] + " ");
        }
        System.out.print("\n");
      }
      b += 1;
    } while (b < VentaEntrada.cantEntradas);

    VentaEntrada.setDatosComprobante();
  };

  public static void llenarButacasPlatea() {
    do {
      System.out.println("Inserte la fila en la que desea estar:");
      fila = sc.nextInt() - 1;

      System.out.println("Inserte la columna en la que desea estar:");
      columna = sc.nextInt() - 1;

      if (butacasPlatea[fila][columna].equals("x")) {
        System.out.println("La posición ya está reservada, inténtelo nuevamente");
        llenarButacasPlatea();
      }
      if (butacasPlatea[fila][columna].equals("0")) {
        butacasPlatea[fila][columna] = "x";
      }
      for (int i = 0; i < butacasPlatea.length; i++) {
        for (int j = 0; j < butacasPlatea[i].length; j++) {
          System.out.print(butacasPlatea[i][j] + " ");
        }
        System.out.print("\n");
      }
      c += 1;
    } while (c < VentaEntrada.cantEntradas);

    VentaEntrada.setDatosComprobante();
  };

  public static void iniciarButacasDel() {
    System.out.println("Butascas disponibles:");
    for (int i = 0; i < butacasDel.length; i++) {
      for (int j = 0; j < butacasDel[i].length; j++) {
        butacasDel[i][j] = "0";

        System.out.print(butacasDel[i][j] + " ");

      }
      System.out.print("\n");
    }
    llenarButacasDel();
  }

  public static void verButacasPlatea() {
    for (int i = 0; i < butacasPlatea.length; i++) {
      for (int j = 0; j < butacasPlatea[i].length; j++) {
        System.out.print(butacasPlatea[i][j] + " ");
      }
      System.out.print("\n");
    }
  }

  public static void verButacasTras() {
    for (int i = 0; i < butacasTras.length; i++) {
      for (int j = 0; j < butacasTras[i].length; j++) {
        System.out.print(butacasTras[i][j] + " ");
      }
      System.out.print("\n");
    }
  };

  public static void verButacasDel() {
    for (int i = 0; i < butacasDel.length; i++) {
      for (int j = 0; j < butacasDel[i].length; j++) {
        System.out.print(butacasDel[i][j] + " ");
      }
      System.out.print("\n");
    }

  };

  public static void verButacas() {
    System.out.println("Butascas disonibles:");
    for (int i = 0; i < tipoButacas.length; i++) {
      for (int j = 0; j < tipoButacas[i].length; j++) {
        System.out.print(tipoButacas[i][j] + " ");
      }
      System.out.print("\n");
    }
    llenarButacas();
  };

}
