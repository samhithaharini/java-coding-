class Product {
    private String productName;
    private double price;
    private Manufacturer manufacturer;
    public Product(String productName, double price, String manufacturerName, String country) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = new Manufacturer(manufacturerName, country);  
    }

    public String getProductDetails() {
        return "Product: " + productName + ", Price: $" + price + ", Manufacturer: " + manufacturer.getManufacturerDetails();
    }

    class Manufacturer {
        private String name;
        private String country;
        public Manufacturer(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public String getManufacturerDetails() {
            return name + " (" + country + ")";
        }
    }
}

public class Product {
    public static void main(String[] args) {
        
        Product laptop = new Product("Laptop", 1500.0, "Dell", "USA");
        System.out.println(laptop.getProductDetails());
      
        Product smartphone = new Product("Smartphone", 800.0, "Samsung", "South Korea");
        System.out.println(smartphone.getProductDetails());

        Product tablet = new Product("Tablet", 300.0, "Apple", "USA");
        System.out.println(tablet.getProductDetails());
    }
}
