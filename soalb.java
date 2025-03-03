package minggu5wsibd;

/**
 *
 * @author Muhammad Shobri
 */

// Kelas A
class A {
    void callthis() {
        System.out.println("Inside Class A’s Method!");
    }
}

// Kelas B (turunan dari A)
class B extends A {
    void callthis() {
        System.out.println("Inside Class B’s Method!");
    }
}

// Kelas C (turunan dari A)
class C extends A {
    void callthis() {
        System.out.println("Inside Class C’s Method!");
    }
}

// Kelas utama untuk Dynamic Dispatch
public class soalb {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;

        ref = b;
        ref.callthis();  // Output: Inside Class B’s Method!

        ref = c;
        ref.callthis();  // Output: Inside Class C’s Method!

        ref = a;
        ref.callthis();  // Output: Inside Class A’s Method!
    }
}