abstract class A {}
abstract class B {}

class XA extends A {}
class YA extends A {}
class XB extends B {}
class YB extends B {}

abstract class AbstractFactory {
    private static final FactoryX _FactoryX = new FactoryX();
    private static final FactoryY _FactoryY = new FactoryY();

    static AbstractFactory getFactory(String type) {
        if(type.equals("X")) {
            return _FactoryX;
        } else if(type.equals("Y")) {
            return _FactoryY;
        }
        return null;
    }

    public abstract A createA();
    public abstract B createB();
}

class FactoryX extends AbstractFactory {
    @Override
    public A createA() {
        return new XA();
    }

    @Override
    public B createB() {
        return new XB();
    }
}

class FactoryY extends AbstractFactory {
    @Override
    public A createA() {
        return new YA();
    }

    @Override
    public B createB() {
        return new YB();
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory("X");
        A a = factory.createA();
    }
}