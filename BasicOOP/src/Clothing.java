public class Clothing {

    String description;
    double price;
    String size = "M";
    public final double TAX = 0.2;
    public final double MIN_PRICE = 10;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double newPrice){

        price = (newPrice < MIN_PRICE) ? MIN_PRICE : newPrice;
    }

    public double getPrice(){
       double priceTax = price * TAX;
       return (price + priceTax);
    }
}
