package figuren;
import ack.shapes.Leinwand;


public class MethodenTest {
public static void main(String[] args) {
  Rechteck rechteckBlau = new Rechteck(100, 200, 100, 50, "blau");
  Kreis kreisGelb = new Kreis(100, 100, 100, "gelb");

  Leinwand leinwand = new Leinwand();

  // leinwand.zeichne(rechteckBlau); // Zeichnen des Rechtecks vor Methodenaufruf rechteckBlau.verschieben(100,100); // Ausführen der Methode leinwand.warte(2000); // Warte 2 Sekunden
  // leinwand.zeichne(rechteckBlau); // Zeichnen des Rechtecks nach der Veränderung
  // rechteckBlau.vergroessern(2);
  // leinwand.warte(2000);
  // leinwand.zeichne(rechteckBlau);
  // rechteckBlau.hoeheBreiteVertauschen();
  // leinwand.warte(2000);
  // leinwand.zeichne(rechteckBlau);

  System.out.println(kreisGelb.flaecheninhaltBerechnen());
  System.out.println(kreisGelb.umfangBerechnen());

    // TESTS
      // rechteck1.verschieben(100, 50);
      //System.out.println(rechteckBlau.flaecheninhaltBerechnen());
      // rechteck1.hoeheBreiteVertauschen();
      // rechteck1.vergroessern(2);
      //System.out.println(rechteckBlau.isQuadrat());
      //System.out.println(rechteckBlau.umfangBerechnen());
}
}
