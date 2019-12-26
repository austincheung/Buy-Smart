package BuySmart;
public class Phones {
    private String brand;
    private String model;
    private String storage;
    private int stock;
    private String price;
    private boolean inStock;
    private String screen;
    private String ram;
    private String battery;
    private String date;


    public Phones(String Brand, String Model, String Storage, String Price, String screen, String ram, String battery, String date)
    {
        this.brand = Brand;
        this.model =Model;
        this.storage = Storage;
        this.price = Price;
        this.stock = 20;
        this.inStock=true;
        this.screen = screen;
        this.ram = ram;
        this.battery = battery;
        this.date=date;
    }


    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }
    public String getStorage()
    {
        return this.storage;
    }
    public boolean inStock()
    {
        return this.inStock;
    }
    public int getStock()
    {
        return this.stock;
    }
    public String getScreen()
    {
        return this.screen;
    }
    public String getRam()
    {
        return this.ram;
    }
    public String getBattery()
    {
        return this.battery;
    }
    public String getDate()
    {
        return this.date;
    }
    public String getPrice()
    {
        return this.price;
    }



}
