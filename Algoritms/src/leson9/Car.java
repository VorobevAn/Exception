package leson9;

public class Car {
    private int cauntDvetey;
    private String color;
    private String motor;

    @Override
    public String toString() {
        return "Car{" +
                "cauntDvetey=" + cauntDvetey +
                ", color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }

    public Car(int cauntDvetey, String color, String motor) {
        this.cauntDvetey = cauntDvetey;
        this.color = color;
        this.motor = motor;
    }
    public void change(Car neim, int caunt){
       Car a1 = neim;
       a1.cauntDvetey = caunt;

    }

    public void revers(Car s1, Car s2){
        String color = s1.color;
        s1.color = s2.color;
       s2.color = color;


        System.out.println(s1);
        System.out.println(s2);


    }
}

