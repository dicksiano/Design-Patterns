class X {
    public void methodX() {

    }
}

class Y {
    public void methodY() {

    }
}

class Z {
    public void methodZ() {

    }
}

class Facade {
    private X _X; 
    private Y _Y; 
    private Z _Z; 

    public void methodX() {
        _X.methodX();
    }

    public void methodY() {
        _Y.methodY();
    }

    public void methodZ() {
        _Z.methodZ();
    }
}