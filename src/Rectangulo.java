public class Rectangulo extends Figura{
    private double l1;
    private double l2;

    /*
    public void Setl1(double b){
        this.l1 = b;
    }

    public void Setl2(double h){
        this.l1 = h;
    }

     */

    public Rectangulo(double b, double h){     /*Constructor*/
        this.l1 = b;
        this.l2 = h;
    }

    public double area() {
        double res = (this.l1) * (this.l2);
        return res;
    }
}
