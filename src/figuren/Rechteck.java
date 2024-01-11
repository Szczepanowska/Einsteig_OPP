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


  public int getPositionX() {
    return this.positionX;
  }

  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  public int getPositionY() {
    return this.positionY;
  }

  public void setPositionY(int positionY) {
    this.positionY = positionY;
  }

  public int getBreite() {
    return this.breite;
  }

  public void setBreite(int breite) {
    if (breite <= 0){
      System.out.println("Wert nicht erlaubt");
    } else {
        this.breite = breite;
    }
  }


  public int getHoehe() {
    return this.hoehe;
  }

  public void setHoehe(int hoehe) {
    if (hoehe <= 0){
      System.out.println("Wert nicht erlaubt");
    } else {
        this.hoehe = hoehe;
    }
  }

  public String getFarbe() {
    return this.farbe;
  }

  public void setFarbe(String farbe) {
    this.farbe = farbe;
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
