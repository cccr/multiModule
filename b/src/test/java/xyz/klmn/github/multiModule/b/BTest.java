package xyz.klmn.github.multiModule.b;

import xyz.klmn.github.multiModule.a.A;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BTest {
    @Test
    public void testAMethod() {
        A a = new A();
        B b = new B();
        b.setA(a);
        b.setText("qQq");
        assertEquals(a.doSomething("qqQ"), b.testAMethod());
    }
}
