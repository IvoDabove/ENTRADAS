// import java.util.Date;

public class Concierto {
  private String nombre;
  private String fecha;
  private String estadio;
  private String ciudad;
  private String banda;
 
  public Concierto(String n, String f, String e, String c, String b) {
    nombre = n;
    fecha = f;
    estadio = e;
    ciudad = c;
    banda = b;
  }

  public void mostrar() {
    String con = nombre
        + ", " + fecha
        + ", " + estadio
        + ", " + ciudad
        + ", " + banda;

    System.out.println(con);
  }

  public void cambiarNombre(String n) {
    nombre = n;
  }

}
