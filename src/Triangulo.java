public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double b, double h){      /*Constructor*/
        this.base = b;
        this.altura = h;
    }

    public double area(){
        return ((base * altura)/2);
    }
}
