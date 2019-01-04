class AX {
    public void methodX() {

    }
}

class AY {
    public void methodY() {

    }
}

class A {
    private AX _AX; // Or AY

    public void methodX() {
        _AX.methodX();
    }

    public void methodY() {
        // Adapt to run methodY
    }
}