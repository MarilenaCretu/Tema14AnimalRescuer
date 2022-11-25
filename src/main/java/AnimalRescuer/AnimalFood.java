package AnimalRescuer;

public class AnimalFood {
    private String name;
    private int price;
    private int amount;
    private int availabilityinstock;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAvailabilityinstock(int availabilityinstock){
        this.availabilityinstock = availabilityinstock;
    }
    public int getAvailabilityinstock(){
        return availabilityinstock;
    }
}
