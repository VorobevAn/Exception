package leson6;

public class Test {
    int a;
    int b;
    int c;
    String ran;
    int d;

    public Test(int a, int b, int c) {
        this(a,b,c,null,0);
    }

    public Test(int a, int b, int c, int d) {
        this( a, b, c, null, d);

    }

    public Test(int a, int b, int c, String ran, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ran = ran;
        this.d = d;
    }

    @Override
    public String toString() {
        return  "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", ran='" + ran + '\'' +
                ", d=" + d +
                '}';
    }
}class test2{
        public static void main(String[] args) {
            Test ran = new Test(2,4,6);
            System.out.println(ran.toString());
        }
}

