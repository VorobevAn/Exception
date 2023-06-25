package leson9;

public class main {
    public static void main(String[] args) {
        Car vaz = new Car(5,"red","v6");
        Car bmv = new Car(3,"blue","v12");
//        vaz.change(vaz, 3);
//        System.out.println(vaz);
        vaz.revers(vaz,bmv);
    }
}
