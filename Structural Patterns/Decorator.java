interface I { 
    void doIt(); 
}

class A implements I { 
    public void doIt() { 
        System.out.print('A'); 
    } 
}

abstract class B implements I {
    private I _core;

    public B(I core) {
        _core = core;
    }

    public void doIt() {
        core.doIt();
    }
}

class X extends B {
    public X(I core) {
        super(core);
    }

    public void doIt() {
        super.doIt();
        doX();
    }

    private void doX() {
        System.out.print('X');
    }
}

class Y extends B {
    public Y(I core) {
        super(core);
    }

    public void doIt()  {
        super.doIt();
        doY();
    }

    private void doY() {
        System.out.print('Y');
    }
}

class Z extends B {
    public Z(I core) {
        super(core);
    }

    public void doIt()  {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print('Z');
    }
}

public class DecoratorDemo {
    public static void main( String[] args ) {
        I[] array = { 
                      new X(new A()),
                      new Y(new X(new A())),
                      new Z(new Y(new X(new A())))
                    };
        
        for (I anArray : array) {
            anArray.doIt();
        }
    }
}