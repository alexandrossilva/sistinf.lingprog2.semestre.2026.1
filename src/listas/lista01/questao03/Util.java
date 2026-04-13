package listas.lista01.questao03;

abstract class Q { }

class U extends S { }

class R extends S { }

class S extends Q { }

class T extends Q { }

class P extends T { }

public class Util {
	
	public static void main(String[] args) {
		S obj1 = new P();	// erro de compilação
		Q obj2 = new Q();	// erro de compilação
		P obj3 = new Q();	// erro de compilação
		U obj4 = new S();	// erro de compilação
		Q obj5 = new U();
	}
	
}