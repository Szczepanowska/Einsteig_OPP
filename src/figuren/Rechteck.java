package figuren;
/**
 * Rechteck
 */
public class Rechteck {

  int positionX;
  int positionY;
  int breite;
  int hoehe;
  String farbe;

  Rechteck(){

  }

  public Rechteck(int positionX, int positionY, int breite, int hoehe, String farbe){
    this.positionX = positionX;
    this.positionY = positionY;
    this.breite = breite;
    this.hoehe = hoehe;
    this.farbe = farbe;
  }

  public void verschieben(int xRichtung, int yRichtung){
    positionX += xRichtung;
    positionY += yRichtung;
  }

  public double flaecheninhaltBerechnen(){
    return hoehe * breite;
  }

  public void hoeheBreiteVertauschen(){
    int h1 = hoehe;
    hoehe = breite;
    breite = h1;
  }

  public void vergroessern(int faktor){
    breite *= faktor;
    hoehe *= faktor;
  }

  public boolean isQuadrat(){
    boolean isQuadrat = (hoehe == breite) ? true : false;
    return isQuadrat;
  }

  public double umfangBerechnen(){
    return 2 * hoehe + 2 * breite;
  }

  public void um90GradDrehen(){
    int centerX = (int) (positionX + breite / 2);
    int centerY = (int) (positionY + hoehe / 2);

    positionX = (int) (centerX - (hoehe / 2));
    positionY = (int) (centerY - (breite / 2));
    hoeheBreiteVertauschen();
  }
}
