package org.oxyl;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(Point copiePoint) {
        this.x = copiePoint.x;
        this.y = copiePoint.y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object obj) {
        // Vérifier si l'objet est de type Point
        if (this == obj) {
            return true;  // Si les deux objets sont le même (comparaison par référence)
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si l'objet passé est null ou n'est pas un Point
        }

        // Cast l'objet en Point
        Point other = (Point) obj;

        // Comparer les coordonnées
        return this.x == other.x && this.y == other.y;
        }

        public double calculerDistance(Point point) {
            double distance = Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
            return distance;
        }

    public void deplacer(double distanceX, double distanceY) {
        x += distanceX;
        y += distanceY;
    }

    public void tourner(double centerX, double centerY, double cosTheta, double sinTheta) {
        // 1. Translation au centre
        double translatedX = x - centerX;
        double translatedY = y - centerY;

        // 2. Rotation
        double rotatedX = translatedX * cosTheta - translatedY * sinTheta;
        double rotatedY = translatedX * sinTheta + translatedY * cosTheta;

        // 3. Retour à la position originale + arrondi
        x = Math.round((rotatedX + centerX) * 100.0) / 100.0;
        y = Math.round((rotatedY + centerY) * 100.0) / 100.0;
    }

    }
