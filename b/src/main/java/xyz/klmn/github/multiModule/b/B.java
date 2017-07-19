package xyz.klmn.github.multiModule.b;

import xyz.klmn.github.multiModule.a.A;

/**
 * Created by Pavel_Korshunov on 7/18/2017.
 */
public class B {

    private A a;
    private String text;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String testAMethod() {
        return a.doSomething(text);
    }
}
