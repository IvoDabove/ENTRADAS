public class Bienvenida {
  private String msg;

  public Bienvenida() {
    msg = "*******************************************\n" +
        "*                                         *\n" +
        "*        ¡Bienvenido a la venta de        *\n" +
        "*      de entradas de conciertos!         *\n" +
        "*                                         *\n" +
        "* Descubre una amplia selección de eventos*\n" +
        "*     musicales y asegura tu lugar en     *\n" +
        "*   el concierto de tus sueños. ¡La música*\n" +
        "*        te espera, compra tus entradas   *\n" +
        "*                   ahora!                *\n" +
        "*                                         *\n" +
        "*******************************************\n";
  }

  public void mostrar() {
    System.out.println(msg);
  }
}
