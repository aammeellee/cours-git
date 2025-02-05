package org.oxyl;

public class RectangleAvecPoint {
    private Point centre;
    private double longueur;
    private double largeur;
    private double angle;

    //Constructeur avec paramètres

    public RectangleAvecPoint(Point centre, double longueur, double largeur, double angle) {
        this.centre = centre;
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
    }

    public RectangleAvecPoint() {
        this.centre = new Point(0.0, 0.0);
        this.longueur = 1.0;
        this.largeur = 1.0;
        this.angle = 0.0;
    }

    public RectangleAvecPoint(RectangleAvecPoint autre) {
        this(autre.centre, autre.longueur, autre.largeur, autre.angle);
    }

    public void deplacer(double distanceX, double distanceY) {
        setCentre(centre.getX() + distanceX, centre.getY() + distanceY);
    }

    public boolean isCarre() {
        return this.longueur == this.largeur;
    }

    public void redimensionner(double f) {
        setLongueur(this.longueur * f);
        setLargeur(this.largeur * f);

    }

    public void tourner(double theta) {
        this.angle += theta;
    }

    // Méthode pour définir la longueur en empêchant les valeurs négatives
    public void setLongueur(double longueur) {
        this.longueur = (longueur < 0) ? 0 : longueur;
    }

    // Méthode pour définir la largeur en empêchant les valeurs négatives
    public void setLargeur(double largeur) {
        this.largeur = (largeur < 0) ? 0 : largeur;
    }

    public void setCentre(double centreX, double centreY) {
        this.centre.setX(centreX);
        this.centre.setY(centreY);
    }
//Ceci est une modificcation
}
