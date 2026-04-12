package listas.lista01.questao06;

class A1 {

    protected int va1 = 2, va2 = 4;

    public A1(int x) {
        va1 += x;
        va2 *= x;
    }

}

class A2 extends A1 {

    protected int vb1 = 10;

    public A2(int x) {
        super(x);
    }

}

class A3 extends A2 {

    protected int vc1 = 0;

    public A3(int x) {
        super(x);
        vc1 = (va1 + va2) * x;
    }

}

public class Util {

    public static void main(String[] args) {
        A1 objeto = new A3(3);
        System.out.println(objeto.va2 - objeto.va1);
    }

}