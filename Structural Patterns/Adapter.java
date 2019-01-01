class OldClass {
    private double _oldProperty;

    public OldClass(double oldProperty) {
        this._oldProperty = oldProperty;
    }

    public void setProperty(double property) {
        this._oldProperty = property;
    }
}

class NewClass {
    private final int _newProperty;

    public NewClass(int newProperty) {
        this._newProperty = newProperty;
    }

    public int getProperty() {
        return this._newProperty;
    }
}

class Adapter {
    private final OldClass _old;

    public Adapter(double property) {
        _old = new Old(property);
    }

    public void adapt(NewClass newObject) {
        int adaptProperty = newObject.getProperty();
        _old.setProperty(adaptProperty);
    }
}