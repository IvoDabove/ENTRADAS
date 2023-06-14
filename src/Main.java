public class Main {
  public static void main(String[] args) {
    Bienvenida mensajeBienvenida = new Bienvenida();
    mensajeBienvenida.mostrar();
    Informacion info = new Informacion();
    Registro regis = new Registro("Ivohizo@gmail.pendejo", "+5438788898");
    info.con_1.mostrar();
    info.con_2.mostrar();
    info.con_2.cambiarNombre("Un lago en el cielo");
    info.con_2.mostrar();
    regis.pedirDatos("+543462679343", "EA@gmail.com");
    

  }
}
