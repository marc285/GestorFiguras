public class GestorFigurasImpl implements GestorFiguras{

    public static double sum(Figura [] l){
        double res = 0;
        for (Figura fig: l){
            res = res + fig.area();
        }
        return res;
    }

    public static Figura [] sort (Figura [] l){
        Figura [] res = new Figura [100];

        return res;
    }

    public static void main(String [] args){
        Figura rect = new Rectangulo(10, 5);
        Figura tri = new Triangulo(10, 20);
        Figura circ = new Circulo(4 );
        Figura cuad = new Cuadrado(2);

        Figura [] l = new Figura[4];
        l[0] = rect;
        l[1] = tri;
        l[2] = circ;
        l[3] = cuad;

        double suma = GestorFigurasImpl.sum(l);
        System.out.println("La suma de las áreas de las figuras es " + suma);
    }

}
