package figuren;

import ack.shapes.Leinwand;

public class SichtbarkeitenTest {

  public static void main(String[] args) {
      Kreis kreis1 = new Kreis(100, 100, -1, "gelb");
      Leinwand leinwand = new Leinwand();
      leinwand.zeichne(kreis1);
  }
}
