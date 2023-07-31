public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("John Doe", 25, "1234567890");
        customers[1] = new Customer("Jane Smith", 30, "0987654321");

        Product[] products = new Product[5];
        products[0] = new Product("Product 1", 10.99);
        products[1] = new Product("Product 2", 20.99);
        products[2] = new Product("Product 3", 5.99);
        products[3] = new Product("Product 4", 15.99);
        products[4] = new Product("Product 5", 8.99);

        Order[] orders = new Order[5];

        try {
            orders[0] = makePurchase(customers[0], products[0], 2);
            orders[1] = makePurchase(customers[1], products[1], -1);
            orders[2] = makePurchase(customers[0], products[3], 10);
            orders[3] = makePurchase(customers[1], products[2], 3);
            orders[4] = makePurchase(customers[0], products[4], 0);
        } catch (CustomerException e) {
            System.out.println("Invalid customer: " + e.getMessage());
            return;
        } catch (ProductException e) {
            System.out.println("Invalid product: " + e.getMessage());
        } catch (AmountException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }

        int totalPurchases = 0;
        for (Order order : orders) {
            if (order != null) {
                totalPurchases++;
            }
        }

        System.out.println("Total purchases: " + totalPurchases);
    }

    public static Order makePurchase(Customer customer, Product product, int amount)
            throws CustomerException, ProductException, AmountException {
        if (customer == null) {
            throw new CustomerException("Customer does not exist");
        }

        if (product == null) {
            throw new ProductException("Product does not exist");
        }

        if (amount <= 0 || amount > 100) {
            throw new AmountException("Invalid amount");
        }

        return new Order(customer, product, amount);
    }
}

class Customer {
    private String fullName;
    private int age;
    private String phoneNumber;

    public Customer(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
}

class Order {
    private Customer customer;
    private Product product;
    private int amount;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    // Getters and setters
}

class CustomerException extends Exception {
    public CustomerException(String message) {
        super(message);
    }
}

class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
}

class AmountException extends Exception {
    public AmountException(String message) {
        super(message);
    }
}

