public class Product {

    String name;
    String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Boolean areTheyEqual(Product p) {
        return name.equals(p.getName());
    }

    }

}

