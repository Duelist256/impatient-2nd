package chapter5;

public class Test {
    static class StaticUnderTest {

    }

    class UnderTest {

    }

    public static void main(String[] args) {
        Test.StaticUnderTest underTest = new Test.StaticUnderTest ();
        UnderTest underTest1 = new Test().new UnderTest();
    }
}
