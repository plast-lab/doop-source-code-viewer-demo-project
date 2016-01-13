package demo; /**
 * Created by anantoni on 13/1/2016.
 */
import extras.*;

public class Main {
    private static Test staticTest;

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.speak();
        test1 = foo();

        Test2 test2 = bar(new Test2());

        test1.speak(new Test2());
        test2.speak();

        test1 = new Test();
        test1.speak();
        staticTest = foo();

        test2.speak();
        int a = 1;
        staticTest = foo();

        test1 = new Main().buz(a, new Test(), test2);
        test1.speak();
        test1 = new Main().buz();
        test1 = foo(test1, test2);
        test1.speak(test2, false, new Test2[10]);
        staticTest.speak();

    }

    public static Test foo() {
        return new Test();
    }

    public static Test foo(Test test, Test2 test2) {
        test.speak();
        test.speak(test2);
        test2.speak();
        return new Test();
    }

    public static Test2 bar(Test2 arg) {
        if (arg == null)
            return new Test2();
        else
            return arg;
    }

    public Test buz() {
        Test localTest = new Test();
        localTest.speak();
        return localTest;
    }

    public Test buz(int a, Test b, Test2 c) {
        b.speak(c);
        Test2 localTest = new Test2();
        localTest.speak();
        c.speak();
        return new Test();
    }
}
