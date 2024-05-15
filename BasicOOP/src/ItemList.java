import  io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler {
    Clothing[] items;
    public ItemList(Clothing[] clothItems){
        items = clothItems;
    }
    public void accept(ServerRequest request, ServerResponse response){
        response.status(Http.Status.OK_200);
        response.headers().put("Content-Type", "text/plain; charset=UTF-8");

        StringBuilder output = new StringBuilder();
        for(Clothing clothItem : items){
            output.append(clothItem.getDescription()).append(" ");
        }
        response.send(output);
    }
}
