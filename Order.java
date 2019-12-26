package BuySmart;
public class Order {

    private Customer customer;
    private Phones phone;
    private String bought;
    private String delivery;
    private int stock;

    public Order(Customer customer, Phones phone, String bought, String delivery, int Stock)
    {
     this.customer = customer;
     this.phone = phone;
     this.bought = bought;
     this.delivery = delivery;
     this.stock = Stock;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }
    public Phones getPhone()
    {
        return this.phone;
    }
    public String dayofpurchase()
    {
        return this.bought;
    }
    public String eta()
    {
        return this.delivery;
    }
    public int getStock()
    {
        return this.stock;
    }
}
