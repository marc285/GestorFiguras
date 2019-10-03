public class Circulo extends Figura{

    private double radio;

    public Circulo (double r){     /*Constructor*/
        this.radio = r;
    }

    public double area(){
        return (Math.PI) * radio * radio;
    }
}
