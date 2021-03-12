package TalleresJava.Taller06;

public class Punto {
    
    private double x;
    private double y;

    
    public Punto(double pX, double pY){
        this.x = pX;
        this.y = pY;
    }

    public static double distancia(Punto p1, Punto p2){
        return Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+ Math.pow((p2.getY()-p1.getY()),2));
    }

    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(double y) {
        this.y = y;
    }

}
