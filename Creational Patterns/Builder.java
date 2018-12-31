abstract class Builder {
    protected Product _product;

    public Product getProduct() {
        return _product;
    }

    public void buildroduct() {
        _product = new Product();
    }

    public abstract void buildFirstProperty();
    public abstract void buildSecondProperty();
}

class Director {
    private Builder _builder;

    public void setBuilder(Builder builder) {
        _builder = builder;
    }

    public Product getProduct() {
        return _builder.getProduct();
    }

    public void buildProduct() {
        _builder.buildProduct();
        _builder.buildFirstProperty();
        _builder.buildSecondProperty();
    }
}

class Product {
    private String _firstProperty = "";
    private String _secondProperty = "";

    public void setFirstProperty(String x) {
        this._firstProperty = x;
    }

    public void setSecondProperty(String x) {
        this._secondProperty = x;
    }
}

class BuilderA extends Builder {
    @Override
    public void buildFirstProperty() {
        _product.setFirstProperty("A1");
    }

    @Override
    public void buildSecondProperty() {
        _product.setSecondProperty("A2");
    }
}

class BuilderB extends Builder {
    @Override
    public void buildFirstProperty() {
        _product.setFirstProperty("B1");
    }

    @Override
    public void buildSecondProperty() {
        _product.setSecondProperty("B2");
    }
}

public class Main {
    public static void main(String args[]) {
        Director director = new Director();
        BuilderA builderA = new BuilderA();

        director.setBuilder(builderA);
        director.buildProduct();

        Product product = director.getProduct();
    }
}

