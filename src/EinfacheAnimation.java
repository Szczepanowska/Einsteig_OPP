import ack.shapes.Leinwand;
import figuren.Kreis;

public class EinfacheAnimation {
  public static void main(String[] args) {
          Kreis kreis = new Kreis(100, 100, 40, "gelb");
          Leinwand leinwand = new Leinwand();

          leinwand.zeichne(kreis);
          // (b) Animationen i.
          // int i = 0;
          // while (i < 5){
          // kreis.verschieben(30, 30);
          // leinwand.warte(300);
          // leinwand.zeichne(kreis);
          // i++;
          // }

        // (b) Animationen ii.

          int leinwandHoehe = leinwand.getLeinwandHoehe();
          int leinwandBreite = leinwand.getLeinwandBreite();
          int x1 = leinwandHoehe - 40;
          int y1 = leinwandBreite - 40;

          leinwand.warte(300);
          kreis.verschieben(x1, 0);
          leinwand.zeichne(kreis);

          leinwand.warte(300);
          kreis.verschieben(-x1 - 60, 0);
          leinwand.zeichne(kreis);

          leinwand.warte(300);
          kreis.verschieben(300, -60);
          leinwand.zeichne(kreis);

          leinwand.warte(300);
          kreis.verschieben(0, y1 - 140);
          leinwand.zeichne(kreis);

          leinwand.warte(300);
          kreis.verschieben(100, -300);
          leinwand.zeichne(kreis);





  }
}
