interface InterfaceA {
    void f();
}

class A implements InterfaceA {
    void f() {
        // Full implementation of the method f()
    }
}

// Client doesn't access A, only access the proxy
class ProxyA implements {
    private A _A;

    ProxyA() {
        this._A = new A();
    }

    void f() {
        // Some discipline to protect the real class
        _A.f();
    }
}