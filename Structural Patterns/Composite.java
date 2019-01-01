interface Component {
    void execute();
}

abstract class Composite implements Component {
    private Component[] _children = new Component[ NUM_CHILDREN ];

    public void execute() {
        for(Component child : _children) {
            child.execute();
        }
    }
}

class Leaf implements Component {
    public void execute() {
        // Do something
    }
}