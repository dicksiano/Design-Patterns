interface Framework {
    Product getProduct();
}

class Product {
    private String _property;

    public Product(String property) {
        this._property = property;
    }
}

class ProductA implements Framework {
    private Product _product;

    public ProductA(String A) {
        this._product = new Product(A);
    }

    @Override
    public Product getProduct() {
        return _product;
    }
}

class ProductB implements Framework {
    private Product _product;

    public ProductB(String B) {
        this._product = new Product(B);
    }

    @Override
    public Product getProduct() {
        return _product;
    }
}

public class FacthoryMethod {
    public static void main(String[] args) {
        Framework framework = null;

        String type = args[0];
        String property = args[1];

        if(type.equals("A")) {
            framework = new ProductA(property);
        } else if(type.equals("B")) {
            framework = new ProductB(property);
        }
        
        Product product = framework.getProduct();
    }
}