package temp.listas.lista01.questao09;

class A1 {

    protected int va1 = 1, va2 = 2;

    public A1(int x) {
        va1 += x;
        va2 *= x;
    }

}

class A2 extends A1 {

    protected int vb1 = 10;
        
}

class A3 extends A2 {

    protected int vc1=0;

    public A3(int y) {
        vc1 = (va1 + va2) * y;
    }

}

public class Util {

    public static void main(String[] args) {
        A3 o = new A3(2);
        System.out.println(o.vc1);
    }

}