import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0;
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Customer customer1 = new Customer("Pinky");

        item1.setDescription("Blue jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        //clothing items for one customer
        Clothing[] items = {item1, item2, item2, item1};
        customer1.addItems(items);

        for(Clothing newCloth: items){
            total += newCloth.getPrice();
        }
        System.out.println("Total amount is "+total);
        System.out.println("Total amount is "+customer1.getTotalClothingCost(items));

        //Using webserver to display the items
        try{
        ItemList list = new ItemList(items);
        Routing routing = Routing.builder().get("/items", list).build();
        ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
        WebServer ws = WebServer.create(config, routing);
        ws.start();
        //ws.shutdown();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}