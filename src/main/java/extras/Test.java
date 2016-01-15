package extras;

/**
 * Created by anantoni on 13/1/2016.
 */
public class Test {

    public Test() {}

    public Test(Test test1, Test2 test2, Test2 test3) {

    }

    public void speak() {
        System.out.println("Test: speak()");
        print(true);
    }

    public void speak(Test2 testParam) {
        System.out.println("Test: speak(Test2)");
        Test2 testLocal = testParam;
        print(false);
    }

    public void speak(Test2 test1, boolean flag, Test2[] test2) {
        System.out.println("Test speak(Test2, boolean, Test[]");
        test1.speak();
        if (flag) {
            test1.speak();
        }
        else {
            test2[5].speak();
        }
        print(true);
    }

    public void print(boolean flag) {
        A a;
        if (flag) {
            a = new A();
        }
        else {
            a = new B();
        }
        a.foo();
    }

    public class A {
        public void foo() {
            System.out.println("A::foo");
        }
    }

    public class B extends A {
        public void foo() {
            System.out.println("B::foo");
        }
    }
}
