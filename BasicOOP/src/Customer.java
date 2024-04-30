public class Customer {

    private Clothing[] items;

    public void addItems(Clothing[] itemsList){
        items = itemsList;
    }

    public Clothing[] getItems(){
        return items;
    }

    public double getTotalClothingCost(Clothing[] itemsList){
        double totalCost = 0;
        for(Clothing cloth: itemsList){
            totalCost += cloth.getPrice();
        }
        return totalCost;
    }
}
