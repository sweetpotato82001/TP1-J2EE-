package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args){
        Endpoint.publish("http://0.0.0.0:9191/", new BankService());
        System.out.println("Web Service deployed on //http://0.0.0.0:9191/");
    }

}
