package BuySmart;

public class Delivery {

    private String mop;
    private String eta;
    private boolean received;
    private boolean delivered;
    private String address;

    public Delivery (String monthofpurchase, String eta, String address)
    {
        this.mop = monthofpurchase;
        this.eta = eta;
        this.received = true;
        this.delivered = false;
        this.address = address;
    }

    public String getMOP()
    {
        return this.mop;
    }

    public String getETA()
    {
        return this.eta;
    }

    public boolean getReceived()
    {
        return this.received;
    }

    public boolean getDelivered()
    {
        return this.delivered;
    }

    public String getAddress() { return this.address; }

    public void changeAddress(String newadd) { this.address = newadd; }
}
