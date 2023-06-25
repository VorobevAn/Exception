package leson8;

public class Pi {
    static final double pi = 3.14;

    public double radius( double radius){
        double plochad = pi * radius *radius;
        return plochad;
    }

    public static void dllina( double radius){
        System.out.println(2 * pi * radius);

    }

    public void result( double radius){
        System.out.println("При радиусе равном: " + radius + "площадь будет равна: " + radius(radius));
        Pi.dllina(6);
    }
}

