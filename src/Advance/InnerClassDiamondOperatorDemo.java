package Advance;

public class InnerClassDiamondOperatorDemo {
    public static void main(String[] args) {
        Handler<Integer> intHandler = new Handler<Integer>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler.handle();
        Handler<? extends Number> intHandler1 = new Handler<Number>(2) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler1.handle();
        Handler<?> handler = new Handler<Object>("test") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        handler.handle();
    }
}
abstract class Handler<T> {
    public T content;

    public Handler(T content) {
        this.content = content;
    }

    abstract void handle();
}
