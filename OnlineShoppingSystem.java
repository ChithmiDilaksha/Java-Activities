// Product class represents a product in the online store
class Product 
{
    private String name;
    private double price;

    public Product(String name, double price) 
	{
        this.name = name;
        this.price = price;
    }

    public String getName() 
	{
        return name;
    }

    public double getPrice() 
	{
        return price;
    }
}


// ShoppingCart class represents a shopping cart
class ShoppingCart 
{
    private Product[] products;
    private int itemCount;

    public ShoppingCart() 
	{
        products = new Product[10];
        itemCount = 0;
    }

    public void addProduct(Product product) 
	{
        if (itemCount < products.length) 
		{
            products[itemCount] = product;
            itemCount++;
        } else 
		{
            System.out.println("The cart is full.");
        }
    }

    public double calculateTotalPrice() 
	{
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) 
		{
            total += products[i].getPrice();
        }
        return total;
    }
}

public class OnlineShoppingSystem 
{
    public static void main(String[] args) 
	{
        // Create some products
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Smartphone", 499.99);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(p1);
        cart.addProduct(p2);

        // Calculate and display the total price
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
		
    }
}
