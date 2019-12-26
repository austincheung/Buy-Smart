package BuySmart;

public class InStore {

    private boolean pickUp;
    private String location;

    public InStore(boolean pickUp, String location)
    {
        this.pickUp=pickUp;
        this.location=location;
    }

    public boolean InStorePickUp()
    {
        return this.pickUp;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void changeLocation(String loc)
    {
        this.location = loc;
    }

}

