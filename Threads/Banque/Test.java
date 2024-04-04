/**
 * Test
 */

// public class Test {
//     public static void main(String[] args) {

//         C x = new C();
//         C y = new C();
//         C z = x;
//         System.out.println(C.i + " et " + z.j);
//     }
// }

// class C {
//     public static int i;
//     public int j;

//     public C() {
//         j = i;
//         i++;
//     }

// }

// C x = new C() i = 2, j = 1
// C y = new C() i = 2, j= 0 => = 2
// C z = x
// Affichage : 1 et 1
// class Base{

// }

// class TestA extends Base {
// public TestA(int j){}
// public TestA(int i, int k){
// super(i,j);
// }
// }

// Quelles formes de constructeur parmi les suivantes doivent-elles être
// explicitement
// presentes dans la definition de classe base ?
// Base(){}
// Base(int j){}
// Base(int j,int k){}
// Base(int j,int k, int l){}

/**
 * Test
 */
class A {
    public int f(int a) {
        return a++;
    }

    public String f() {
        return "A";
    }
}

class B extends A {
    public int f(int a, int b) {
        return a + b;
    }

    public String f() {
        return "B";
    }
}

class Test {

    public static void main(String[] args) {
        // B obj = new B();
        // int x = obj.f(3);
        // int y = obj.f(3, 3);
        // System.out.println("x == " + x + " y === " + y);
        A a1 = new A();
        A a2 = new B();
        B b = new B();

        System.out.println(a1.f());
        System.out.println(a2.f());
        System.out.println(b.f());

    }
}

class inerTest {

}