package org.oxyl;

public class Rectangle {
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;

    //Constructeur avec paramètres

    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle) {
        this.centreX = centreX;
        this.centreY = centreY;
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
    }

    // Constructeur par défaut
    public Rectangle() {
        this(0.0, 0.0, 1.0, 1.0, 0.0);
    }

    // Constructeur par copie
    public Rectangle(Rectangle autre) {
        this(autre.centreX, autre.centreY, autre.longueur, autre.largeur, autre.angle);
    }

    // Méthode pour déplacer le rectangle
    public void deplacer(double distanceX, double distanceY) {
        this.centreX += distanceX;
        this.centreY += distanceY;
    }

    // Méthode pour vérifier si le rectangle est carre
    public boolean isCarre() {
        return this.longueur == this.largeur ;
    }

    // Méthode pour redimensionner le cercle
    public void redimensionner(double f) {
        setLongueur(this.longueur * f);
        setLargeur(this.largeur * f);

    }

    public void tourner (double theta) {
        this.angle += theta ;
    }

    // Méthode pour définir la longueur en empêchant les valeurs négatives
    public void setLongueur(double longueur) {
        this.longueur = (longueur < 0) ? 0 : longueur;
    }

    // Méthode pour définir la largeur en empêchant les valeurs négatives
    public void setLargeur(double largeur) {
        this.largeur = (largeur < 0) ? 0 : largeur;
    }

}
