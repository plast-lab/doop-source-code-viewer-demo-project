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
    }

    public void speak(Test2 testParam) {
        System.out.println("Test: speak(Test2)");
        Test2 testLocal = testParam;
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
    }
}
